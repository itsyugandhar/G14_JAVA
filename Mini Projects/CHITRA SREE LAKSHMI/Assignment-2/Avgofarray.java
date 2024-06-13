//2) Write a Java program to calculate the average value of array elements.
import java.util.Scanner;

public class Avgofarray{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the elements:");
        int n=sc.nextInt();
        int arr[]=new int[n];
        int sum=0;
        System.out.println("Enter the array elements:");
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();

        }
        
        for(int i=0;i<arr.length;i++){
            sum=sum+arr[i];
        }
         float avg=sum/n;
        System.out.println("Average of the elements in the array: "+avg);
        
    }
}