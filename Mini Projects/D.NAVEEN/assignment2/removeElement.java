package Assignment;
import java.util.ArrayList;
import java.util.Scanner;
public class removeElement {
    removeElement(int[] arr , int index){
         ArrayList<Integer> list =  new ArrayList<>();
         for(int i = 0  ;i<arr.length ; i++){
            if(i!=index){
                list.add(arr[i]);
            }
         }
         System.out.println("araay after removeing elements ......!");
         System.out.println(list);
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the length of the Array: ");
        int n = sc.nextInt();
        int [] arr = new int[n];
        System.out.println("enter the elements of the Array: ");
        for(int i = 0 ; i< n ;i++){ 
            arr[i] =sc.nextInt();
        }
        System.out.println("enter the element index which you want to remove from the Array :");
        int index = sc.nextInt();
        removeElement r1 = new removeElement(arr,index);
    }

    
}
