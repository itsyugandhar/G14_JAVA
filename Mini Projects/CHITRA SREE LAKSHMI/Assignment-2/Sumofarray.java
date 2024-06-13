import  java.util.*;

public class Sumofarray{
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
        System.out.println("sum of the elements in the array: "+sum);
        
    }
}