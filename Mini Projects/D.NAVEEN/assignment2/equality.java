import java.util.Arrays;
import java.util.Scanner;
public class equality {

    static boolean checkEquality(int[] arr1 ,int[] arr2){
        if(arr1.length!=arr2.length){
            return false;
        }
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        for(int i =0 ; i< arr1.length ; i++){
            if(arr1[i]!= arr2[i]){
                return false;
            }
        } return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the first array length :");
        int n = sc.nextInt();
        int[] arr1 = new int[n];
        System.out.println("enter the elements of the first array ");
        for(int i = 0 ; i< arr1.length ; i++){
            arr1[i]  = sc.nextInt();
        }
        System.out.println("enter the length of the second array :");
        int m = sc.nextInt();
        int []arr2 = new int[m];
        System.out.println("enter the elements of the second array :");
        for(int i =0 ; i<m ; i++){
            arr2[i] = sc.nextInt();

        }
       if(checkEquality(arr1,arr2)){
        System.out.println("yes these are equal ...!");
       }
       else{
        System.out.println("no they are not equal :");

       }    
    }
}
