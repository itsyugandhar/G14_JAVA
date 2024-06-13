package Assignment;

import java.util.HashSet;

public class duplicates {

    static void duplicates(int[] arr){
        HashSet<Integer> list = new HashSet<>();
        for(int i = 0 ; i<arr.length; i++){
            list.add(arr[i]);
        }
        System.out.println(list);
    }
    public static void main(String[] args) {
        int[] arr = {2,3,4,2,3,4,2,4,4,5,3,5};
        duplicates(arr);
    }
}
