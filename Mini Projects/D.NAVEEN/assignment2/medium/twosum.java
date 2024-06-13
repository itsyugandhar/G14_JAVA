package medium;

import java.util.ArrayList;
import java.util.Scanner;

public class twosum {
    static void twosum(int[] arr, int n){
        ArrayList<Integer> list = new ArrayList<>();
        for(int i= 0 ; i< arr.length ; i++){
            for(int j =i+1 ; j < arr.length ; j++){
                if(arr[i]+arr[j]== n){
                    list.add(i);
                    list.add(j);
                }
            }
            if(list.size()==2){
           System.out.println(list);
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the length of the array :");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("enter the elements");
        for(int i = 0 ; i< arr.length ; i++){
            arr[i]  = sc.nextInt();
        }
        System.out.println("enter the target number :");
        int x = sc.nextInt();
        twosum(arr,x);

    }

    
}
