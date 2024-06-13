import java.io.*;
import java.util.*;

public class Twosum {
   public static void main(String args[]) {
      Scanner sc = new Scanner(System.in);
      System.out.print("enter the array size:");
      int n = sc.nextInt();
      int arr[] = new int[n];
      System.out.print("enter the elements:");
      for (int i = 0; i < n; i++) {
         arr[i] = sc.nextInt();
      }
      System.out.print("enter the target element:");
      int target = sc.nextInt();
      twosum(arr, target);
   }

   public static void twosum(int arr[], int target) {
      Arrays.sort(arr);
      for (int i = 0; i < arr.length - 1; i++) {
         for (int j = i + 1; j < arr.length; j++) {
            int sum = arr[i] + arr[j];
            if (sum == target) {
               System.out.print(arr[i] + " " + arr[j]);
            }
         }
         System.out.println();
      }
   }
}
