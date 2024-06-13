import java.util.*;
public class Threesum{
   public static void main(String args[]){
      Scanner sc=new Scanner(System.in);
      System.out.print("enter the array size:");
      int n=sc.nextInt();
      int arr[]=new int[n];
      System.out.print("enter the elements:");
      for(int i=0;i<n;i++){
         arr[i]=sc.nextInt();
      }
      System.out.print("enter the target element:");
      int target=sc.nextInt();
      threesum(arr,target);
   }
      public static void threesum(int arr[],int target){
        Arrays.sort(arr);
        for(int i=0;i<arr.length-2;i++){
          for(int j=i+1;j<arr.length-1;j++){
             for(int k=j+1;k<arr.length;k++){
                int sum=arr[i]+arr[j]+arr[k];
                if(sum==target){
                 System.out.print("["+ arr[i]+" "+arr[j]+" " +arr[k] +"]");
                 break;
                }
            }
          System.out.println();
         }
       }
   }
}

