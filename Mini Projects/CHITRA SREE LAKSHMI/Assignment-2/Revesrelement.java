// 4) Write a Java program to reverse an array of integer values.
import java.util.*;

public class Revesrelement{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the elements:");
        int n=sc.nextInt();
        int m=n;
        int arr[]=new int[n];
        int arr1[]=new int[m];
        System.out.println("enter the elements:");
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=sc.nextInt();
        }
        int j=0;
       for(int i=m-1;i>=0;i--)
        {
            arr1[j]=arr[i];
            j++;
        }
        
        System.out.println("After reversing the array:");
        for(int i=0;i<n;i++)
        {
            System.out.print(" "+arr1[i]);
        } 
    }
}