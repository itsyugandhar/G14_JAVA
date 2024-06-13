package Assignment;

import java.util.Scanner;
public class sumArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the length of the array :");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("enter the elements");
        for(int i = 0 ; i< arr.length ; i++){
            arr[i]  = sc.nextInt();
        }
        int sum = 0;
        for(int x=0 ; x <n;x++){
            sum +=arr[x];
        }
        System.out.println("sum of the Array is :"+sum);

    }
    
}