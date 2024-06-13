package medium;
import java.util.HashMap;
import java.util.Map;
public class subarray {
    static int subArraySum(int[] arr , int k ){
        int ans = 0 , pre = 0 ;
        Map<Integer,Integer> prefixSumF = new HashMap<>();
        prefixSumF.put(0,1);
        for(int  i= 0 ;i <arr.length ; i++){
            pre = pre+arr[i];
            ans = ans+prefixSumF.getOrDefault(pre-k,0);
            prefixSumF.put(pre,prefixSumF.getOrDefault(pre,0)+1);

        }
        return ans;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int  k= 5;
        System.out.println(subArraySum(arr,k));

    }
    
}
