package medium;

import java.util.HashMap;

public class majority {
    static int majorityelement(int[] arr){
        int size = arr.length;

        HashMap<Integer,Integer> has = new HashMap<Integer,Integer>();
        for(int i =0 ; i <size ; i++){
            if(has.containsKey(arr[i])){
                int count = has.get(arr[i])+1;
                if(count>arr.length/2){
                    return arr[i];
                }
                else{
                    has.put(arr[i],count);
                }
            }
            else{
                has.put(arr[i],1);
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr  = {1,2,3,2,1,2,3,2,1,2,3,4,5,4,4,2};
        int ans = majorityelement(arr);
        if(ans!=-1){
            System.out.println("majority element is :"+ ans);
        }
        else{
            System.out.println("majority element not found ");
        }
    }
    
}
