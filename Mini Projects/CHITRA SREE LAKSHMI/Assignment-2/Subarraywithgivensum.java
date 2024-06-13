import java.util.*;
import java.io.*;
import java.util.Scanner;
public class Subarraywithgivensum{
    public static void main(String args[])
    {
       Scanner sc=new Scanner(System.in);
       System.out.print("enter the array size:");
       int n=sc.nextInt();
       int arr[]=new int[n];
       System.out.print("enter the elemnts:");
       for(int i=0;i<n;i++)
        {
           arr[i]=sc.nextInt();
        }
        System.out.println("enter the target element:");
        int target=sc.nextInt();
        subarray(arr,n,target);
    } 
    public static void subarray(int arr[],int n,int target)
    {
       for(int i=0;i<n;i++)
       {
           int sum=0;
           for(int j=i;j<n;j++)
           {
                sum+=arr[j];
            
                if(sum==target)
                {
                    System.out.println("subarray is from " +i+ " to " +j);
                    System.out.print("[");
                    for (int k=i; k<=j; k++) 
                    {
                        
                         System.out.print(arr[k] + " ");
                    }
                    System.out.println("]");
                }
            }
        }
    }
}    
