import java.util.Scanner;

public class consecutive0s1s2s {
    static void sort(int[] arr){
        int i, cnt0 = 0, cnt1 = 0,
        cnt2 = 0;
    for (i = 0; i < arr.length; i++)
    {
        switch (arr[i])
        {
            case 0:
            cnt0++;
            break;
            case 1:
            cnt1++;
            break;
            case 2:
            cnt2++;
            break;
        }
    }
     i = 0 ;
    while(cnt0<0){
        arr[i++]=0;
        cnt0--;
    }
    while (cnt1 > 0)
        { 
            arr[i++] = 1; 
            cnt1--; 
        }
        while (cnt2 > 0)  
        { 
            arr[i++] =2; 
            cnt2--;
        }
    for( i =0 ; i<arr.length ; i++){
        System.out.print(arr[i]+" ");
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
    sort(arr);
}
}
