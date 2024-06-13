import java.util.Scanner;

public class Removelement{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the elements:");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("enter the elements:");
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter the element which you want to remove:");
        int key=sc.nextInt();
        for(int i=0;i<arr.length;i++){
            if(key==arr[i])
            {
                for(int j=i;j<arr.length-1;j++){
                    arr[j]=arr[j+1];
                }
                break;
            }
            for( i=0;i<arr.length-1;i++)
            {
                System.out.print (arr[i]+" ");
            }
        }
    
    }
}