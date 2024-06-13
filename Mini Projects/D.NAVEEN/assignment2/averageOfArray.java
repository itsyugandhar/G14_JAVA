package Assignment;

import java.util.Scanner;

public class averageOfArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the length of the Array: ");
        int n = sc.nextInt();
        int [] arr = new int[n];
        System.out.println("enter the elements of the Array: ");
        for(int i = 0 ; i< n ;i++){
            arr[i] =sc.nextInt();
        }
        int sum = 0;
        for(int x=0 ; x <n;x++){
            sum +=arr[x];
        }
        System.out.println("average of Array :"+sum/n);
    }
    
}
