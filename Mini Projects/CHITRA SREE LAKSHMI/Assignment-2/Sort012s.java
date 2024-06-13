import java.util.Scanner;

public class Sort012s{
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the array size:");
        int n = sc.nextInt();
        int a[] = new int[n];
        System.out.print("enter the elements:");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        sort(a,n);
     }

    public static void sort(int a[],int n){
       int low=0;
       int mid=0;
       int high=n-1;
       while(mid<=high){
           if(a[mid]==0){
               int temp=a[low];
               a[low]=a[mid];
               a[mid]=temp;
               low++;
               mid++;
            }
            else if(a[mid]==2){
                int temp=a[high];
                a[high]=a[mid];
                 a[mid]=temp;
                  high--;
             }

             else{
                 mid++;
              }

        }
        for(int i=0;i<n;i++){
             System.out.print(a[i]+ " ");
         }
       }
} 



























































































