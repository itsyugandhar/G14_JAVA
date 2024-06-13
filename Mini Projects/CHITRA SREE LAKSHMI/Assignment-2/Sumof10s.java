import java.util.*;

public class Sumof10s {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the array size:");
        int n = sc.nextInt();
        int a[] = new int[n];
        System.out.print("enter the elemnts:");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int key=10;
        int sum = 0;
        for (int i = 0; i < n; i++) {
            if (key == a[i]) {
                sum += a[i];
            }
        }
        if (sum == 30) {
            System.out.print("true");
        } else {
            System.out.print("false");
        }

    }
}