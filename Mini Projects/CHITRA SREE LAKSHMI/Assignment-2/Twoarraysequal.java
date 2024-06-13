import java.util.*;
public class Twoarraysequal{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the array1 size:");
        int n=sc.nextInt();
        int arr1[]=new int[n];
        System.out.print("enter the array2 size:");
        int m=sc.nextInt();
        int arr2[]=new int[m];
        System.out.println("Enter the array1 elements:");
        for(int i=0;i<arr1.length;i++)
        {
            arr1[i]=sc.nextInt();
        }
        System.out.println("Array1 elements are:"); 
        System.out.println(Arrays.toString(arr1));
        System.out.println("Enter the array2 elements:");
        for(int j=0;j<arr2.length;j++)
        {
            arr2[j]=sc.nextInt();
        }
        System.out.println("Array2 elements are:"); 
        System.out.println(Arrays.toString(arr2));

        // boolean equal=Arrays.equals(arr1,arr2);
        // System.out.println("Given two arrays are equal: "+equal);

        if(arr1.length==arr2.length){
            System.out.println("Given two arrays are equal");
        }
        else{
            System.out.println("Given two arrays are not equal");
        }
    }
}