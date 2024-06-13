package Assignment;

import java.util.Scanner;

public class reverseArray {

    static void reverse(int[] arr){
       int low = 0;
        int high = arr.length-1;
        int temp = 0;
        while(low<high){
            temp = arr[low];
            arr[low] = arr[high];
            arr[high] = temp;
            low++;
            high--;
        }
        System.out.println("After reversing array");
        for(int i  = 0 ; i<arr.length ; i++){
            System.out.print(arr[i]+"");
        }

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
        reverse(arr);

    }
    
}
