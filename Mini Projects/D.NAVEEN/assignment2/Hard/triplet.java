package Hard;

public class triplet {
    static void findTriplet(int[] arr, int n){
        boolean found = false;
        for(int i =0 ;i<n-2 ;i++){
            for(int j = i+1 ; j<n-1 ;j++){
                for(int k =j+1;k<n ;k++){
                    if(arr[i]+arr[j]+arr[k] ==0){
                        System.out.println(arr[i]+" "+arr[j]+" "+arr[k]);
                        found = true;
                    }
                }
            }
        }
    }
    public static void main(String[] args) {
        int [] arr = {0,-1,2,1,-4,2,-3};
        int n = arr.length;
        findTriplet(arr,n);
    }
    
}
