import java.util.Arrays;
public class secondLarge {
    public static void main(String[] args){
        int [] arr = {1,3,5,2,6,8,6,3,};
        Arrays.sort(arr);
        for(int i = 0 ; i <arr.length ; i++){
            System.out.print(arr[i]);
        }
       int a = arr.length-2;
      System.out.println("second largest number in this array :"+a);
    }
}
