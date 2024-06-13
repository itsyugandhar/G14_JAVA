package medium;
import java.util.Scanner;
public class consecutiveones {

    static void consecutiveones(int [] arr){
        int count = 0 ;
        int summ = 0 ;
        for(int  i = 0 ; i< arr.length ; i++){
            if(arr[i]==1){
                count++;
            }
            else{
                summ = Math.max(count,summ);
                count = 0;
            }
      
           
        }
        int x =  Math.max(summ,count);
        System.out.println(x);
    }

    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("enter the length of the array :");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("enter the elements");
        for(int i = 0 ; i< arr.length ; i++){
            arr[i]  = sc.nextInt();
        }
        consecutiveones(arr);
        
    }
    
}
