package medium;

public class kadanes {
    static int subarray(int[] arr){
        int max_sum = 0; 
         int cur_sum = 0;
         for(int i =0 ; i  <arr.length ; i++){
            cur_sum =cur_sum+arr[i];
            if(cur_sum>max_sum){
                max_sum = cur_sum;
            }
            if(cur_sum<0){
                cur_sum = 0;
            }
         }
         return max_sum;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,-9,2,1,-1,4,-3,-9,8,4,-5};
        System.out.println("maximum sub array :"+subarray(arr));
    }
    
}
