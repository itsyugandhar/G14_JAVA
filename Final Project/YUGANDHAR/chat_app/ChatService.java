import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ChatService {
    public boolean sendMessage(Message message) {
        String query = "INSERT INTO Messages (sender_id, receiver_id, message_text) VALUES (?, ?, ?)";
        try (Connection conn = Database.getConnection();
             PreparedStatement stmt = conn.prepareStatement(query)) {
            stmt.setInt(1, message.getSenderId());
            stmt.setInt(2, message.getReceiverId());
            stmt.setString(3, message.getMessageText());
            stmt.executeUpdate();
            return true;
        } catch (SQLException e) {
            e.printStackTrace();
            System.err.println("Error sending message: " + e.getMessage());
            return false;
        }
    }

    public List<Message> getMessages(int userId) {
        List<Message> messages = new ArrayList<>();
        String query = "SELECT m.message_id, m.sender_id, m.receiver_id, m.message_text, u.username AS sender_name, m.timestamp " +
                       "FROM Messages m " +
                       "JOIN Users u ON m.sender_id = u.user_id " +
                       "WHERE m.receiver_id = ?";
        try (Connection conn = Database.getConnection();
             PreparedStatement stmt = conn.prepareStatement(query)) {
            stmt.setInt(1, userId);
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                Message message = new Message(
                    rs.getInt("sender_id"),
                    rs.getInt("receiver_id"),
                    rs.getString("message_text")
                );
                message.setMessageId(rs.getInt("message_id"));
                message.setSenderName(rs.getString("sender_name"));
                message.setTimestamp(rs.getTimestamp("timestamp"));
                messages.add(message);
            }
        } catch (SQLException e) {
            e.printStackTrace();
            System.err.println("Error retrieving messages: " + e.getMessage());
        }
        return messages;
    }

    public boolean editMessage(int messageId, String newMessageText) {
        String query = "UPDATE Messages SET message_text = ? WHERE message_id = ?";
        try (Connection conn = Database.getConnection();
             PreparedStatement stmt = conn.prepareStatement(query)) {
            stmt.setString(1, newMessageText);
            stmt.setInt(2, messageId);
            int rowsAffected = stmt.executeUpdate();
            return rowsAffected > 0;
        } catch (SQLException e) {
            e.printStackTrace();
            System.err.println("Error editing message: " + e.getMessage());
            return false;
        }
    }

    public boolean deleteMessage(int messageId) {
        String query = "DELETE FROM Messages WHERE message_id = ?";
        try (Connection conn = Database.getConnection();
             PreparedStatement stmt = conn.prepareStatement(query)) {
            stmt.setInt(1, messageId);
            int rowsAffected = stmt.executeUpdate();
            return rowsAffected > 0;
        } catch (SQLException e) {
            e.printStackTrace();
            System.err.println("Error deleting message: " + e.getMessage());
            return false;
        }
    }
}
