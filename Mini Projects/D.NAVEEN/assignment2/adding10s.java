import java.util.Scanner;

public class adding10s {

    static boolean checkingcondition(int [] arr){
        int count =0;
        for(int i = 0 ; i<arr.length ; i++){
            if(arr[i]==10){
                count++;
            }
        }
        if(count!=3){
            return false;
        }

        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the length of the Array: ");
        int n = sc.nextInt();
        int [] arr = new int[n];
        System.out.println("enter the elements of the Array: ");
        for(int i = 0 ; i< n ;i++){
            arr[i] =sc.nextInt();
        }
    System.out.println(checkingcondition(arr));
    }
}
