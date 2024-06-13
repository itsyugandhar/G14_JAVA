import java.io.*;
import java.util.*;
public class Foursum
{
   public static void main(String args[])
   {
      Scanner sc=new Scanner(System.in);
      System.out.print("enter the array size:");
      int n=sc.nextInt();
      int arr[]=new int[n];
      System.out.print("enter the elements:");
      for(int i=0;i<n;i++)
      {
         arr[i]=sc.nextInt();
      }
      System.out.print("enter the target element:");
      int target=sc.nextInt();
      foursum(arr,target);
   }
      public static void foursum(int arr[],int target)
      {
         for(int i=0;i<arr.length-3;i++)
         {
            for(int j=i+1;j<arr.length-2;j++)
           {
               for(int k=j+1;k<arr.length-1;k++)
               {
                  for(int l=k+1;l<arr.length;l++)
                  {
                     int sum=arr[i]+arr[j]+arr[k]+arr[l];
                     if(sum==target)
                     {
                        System.out.print("["+arr[i]+" "+arr[j]+" " +arr[k]+" "+arr[l]+"]");
                     }
                  }
                  System.out.println();
               }
            }
         }
      }
}

