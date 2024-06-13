import java.util.List;
import java.util.Scanner;

public class Main {
    private static UserService userService = new UserService();
    private static ChatService chatService = new ChatService();
    private static User currentUser;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("1. Register");
            System.out.println("2. Login");
            System.out.println("3. Exit");
            System.out.print("Choose an option: ");
            int option = scanner.nextInt();
            scanner.nextLine();

            switch (option) {
                case 1:
                    register(scanner);
                    break;
                case 2:
                    login(scanner);
                    if (currentUser != null) {
                        chatMenu(scanner);
                    }
                    break;
                case 3:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }
    }

    private static void register(Scanner scanner) {
        System.out.print("Enter username: ");
        String username = scanner.nextLine();
        System.out.print("Enter password: ");
        String password = scanner.nextLine();

        User user = new User(username, password);
        if (userService.registerUser(user)) {
            System.out.println("Registration successful!");
        } else {
            System.out.println("Registration failed. Username may already be taken.");
        }
    }

    private static void login(Scanner scanner) {
        System.out.print("Enter username: ");
        String username = scanner.nextLine();
        System.out.print("Enter password: ");
        String password = scanner.nextLine();

        currentUser = userService.loginUser(username, password);
        if (currentUser != null) {
            System.out.println("Login successful!");
        } else {
            System.out.println("Login failed. Invalid username or password.");
        }
    }

    private static void chatMenu(Scanner scanner) {
        while (true) {
            System.out.println("1. Send message");
            System.out.println("2. View messages");
            System.out.println("3. Edit message");
            System.out.println("4. Delete message");
            System.out.println("5. Logout");
            System.out.print("Choose an option: ");
            int option = scanner.nextInt();
            scanner.nextLine();

            switch (option) {
                case 1:
                    sendMessage(scanner);
                    break;
                case 2:
                    viewMessages();
                    break;
                case 3:
                    editMessage(scanner);
                    break;
                case 4:
                    deleteMessage(scanner);
                    break;
                case 5:
                    currentUser = null;
                    return;
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }
    }

    private static void sendMessage(Scanner scanner) {
        System.out.print("Enter recipient username: ");
        String recipientUsername = scanner.nextLine();
        System.out.print("Enter your message: ");
        String messageText = scanner.nextLine();

        User recipient = userService.getUserByUsername(recipientUsername);
        if (recipient != null) {
            Message message = new Message(currentUser.getUserId(), recipient.getUserId(), messageText);
            if (chatService.sendMessage(message)) {
                System.out.println("Message sent successfully!");
            } else {
                System.out.println("Failed to send message.");
            }
        } else {
            System.out.println("Recipient not found.");
        }
    }

    private static void viewMessages() {
        List<Message> messages = chatService.getMessages(currentUser.getUserId());
        if (messages.isEmpty()) {
            System.out.println("No messages.");
        } else {
            for (Message message : messages) {
                System.out.println("[" + message.getTimestamp() + "] ID: " + message.getMessageId() + " From " + message.getSenderName() + ": " + message.getMessageText());
            }
        }
    }

    private static void editMessage(Scanner scanner) {
        viewMessages();
        System.out.print("Enter message ID to edit: ");
        int messageId = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Enter new message text: ");
        String newMessageText = scanner.nextLine();

        if (chatService.editMessage(messageId, newMessageText)) {
            System.out.println("Message edited successfully!");
        } else {
            System.out.println("Failed to edit message.");
        }
    }

    private static void deleteMessage(Scanner scanner) {
        viewMessages();
        System.out.print("Enter message ID to delete: ");
        int messageId = scanner.nextInt();
        scanner.nextLine();

        if (chatService.deleteMessage(messageId)) {
            System.out.println("Message deleted successfully!");
        } else {
            System.out.println("Failed to delete message.");
        }
    }
}
