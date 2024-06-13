import java.util.*;
public class Missingnumber{
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
        int sum=0;
        int totalsum=(n+1)*(n+2)/2;
        System.out.println("Total sum is: "+totalsum);
        for(int i=0;i<arr.length;i++)
        {
            sum=sum+arr[i];
        }
        int missingnum=totalsum-sum;
        System.out.println("Missing number is: "+missingnum);
        
    }
}