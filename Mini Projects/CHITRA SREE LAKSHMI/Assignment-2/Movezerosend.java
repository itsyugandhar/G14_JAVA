import java.util.*;
public class Movezerosend{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the array size:");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter the array elements:");
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println("Array elements are:"); 
        System.out.println(Arrays.toString(arr));
        int count=0;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]!=0)
            {
                arr[count]=arr[i];
                count++;
            }
        }
        while(count<arr.length)
        {
            arr[count]=0;
            count++;  
        }
        System.out.println("after moving zeros to end the array is:");
        for(int i=0;i<arr.length;i++)
        {
            System.out.println(arr[i]+ " ");
        }
    }
}