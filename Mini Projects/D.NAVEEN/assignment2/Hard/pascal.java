package Hard;

public class pascal {
    public static void main(String[] args) {
        int row = 6 ;
        for(int  i = 0 ; i <row ; i++){
            for(int j = 0;  j<row ; j++){
                System.out.print(" ");
            }
            int n = 1 ; 
            for(int j =0 ;  j<=i ; j++){
                System.out.print(n+ " ");
                n = n*(i-j)/(j+1);
            }
            System.out.println();
        }
    }
}
