import java.util.*;
import java.io.*;
import java.util.Scanner;
public class Pascaltriangle
{
    public static void main(String args[])
    {
       Scanner sc=new Scanner(System.in);
	System.out.print("enter the no of rows:");
       int n=sc.nextInt();
       int spaces=n;
       int number=1;
       for(int i=0;i<n;i++)
	{
          for(int s=1;s<=spaces-1;s++)
	  {
               System.out.print(" ");
           }
           number=1;
           for(int j=0;j<=i;j++)
	   {
                  System.out.print(number+" ");
                  number=number*(i-j)/(j+1);
            }
            spaces--;
            System.out.println();
       }
  }
}
