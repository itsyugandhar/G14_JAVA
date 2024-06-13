// 4) Write a Java program to reverse an array of integer values.
import java.util.*;

public class arrayreverse{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        
        
        System.out.println("Enter the size of the elements:");
        int n=sc.nextInt();
       
        int arr[]=new int[n];
       
        System.out.println("enter the elements:");
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println("Array elements are:");
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i] + " ");
        }
        
        System.out.println();
        System.out.println("After reversing the array:");
        int len = n-1;
        for(int i=len ; i >= 0;i--)
        {
            System.out.print(arr[i]+" ");
        }
        
    }
}