import java.util.*;
public class RemoveDuplicates{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter the array elements:");
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println("Array elements are:"); 
        System.out.println(Arrays.toString(arr));
        int temp;
        for(int i=0;i<arr.length;i++)
        {
            for(int j=i+1;j<arr.length;j++)
            {
                if(arr[i]>arr[j])
                {
                    temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
                
            }
        }
        System.out.println("Sorted Array elements are:"); 
        System.out.println(Arrays.toString(arr));
        int j=0;
        for(int i=0;i<arr.length-1;i++)
        {
           
            if(arr[i]!=arr[i+1])
            {
                arr[j]=arr[i];
                j++;

            }
        }
        arr[j]=arr[arr.length-1];
        System.out.println("After removing duplicate elements Array elements are:");
        for(int k=0;k<=j;k++)
        {
            System.out.println(arr[k]+ " ");
        }
        
    }
}