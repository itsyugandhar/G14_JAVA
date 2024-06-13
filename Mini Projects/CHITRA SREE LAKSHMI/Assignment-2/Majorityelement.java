import java.util.Scanner;

public class Majorityelement{
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the array size:");
        int n = sc.nextInt();
        int a[] = new int[n];
        System.out.print("enter the elements:");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
       }
       majorityelement(a,n);
   }
  public static void majorityelement(int a[],int n){
     int maxcount=0,index=-1;
    for(int i=0;i<n;i++){
       int count=0;
      for(int j=i;j<n;j++){
           if(a[i]==a[j])
               count++;
        }
        
       if(count>maxcount){
          maxcount=count;
          index=i;
       }
    }
    if(maxcount>n/2){
             System.out.println("majority element is"+a[index]);
     }
     else{
           System.out.println("no majority element");
       }
   }
}
