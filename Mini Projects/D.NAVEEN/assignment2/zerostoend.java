import java.util.ArrayList;
import java.util.Scanner;
public class zerostoend{

    static void zeros(int[] arr){
        ArrayList<Integer> list = new ArrayList<>();
        int count = 0;
        for(int i= 0 ; i<arr.length ; i++){
            if(arr[i]!= 0){
                list.add(arr[i]);
                count++;
            }
        }
      for(int i = count;i<arr.length ; i++ ){
        list.add(0);
      }
      System.out.println(list);


        
    }
   public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the length of the array :");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("enter the elements");
        for(int i = 0 ; i< arr.length ; i++){
            arr[i]  = sc.nextInt();
        }
        zeros(arr);
        
    }
    
}
