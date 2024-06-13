import java.util.Scanner;

public class Maxsubarraysum {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the array size:");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.print("enter the elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // int maxSum = maxSubarraySum(arr, n);
        // System.out.println("Maximum Subarray Sum: " + maxSum);
        int ans = kadane(arr);
        System.out.println(ans);
    }

    public static int maxSubarraySum(int arr[], int n) {
        int currentMax = arr[0];
        int globalMax = arr[0];

        for (int i = 1; i < n; i++) {
            int sum = arr[i];
            for (int j = i - 1; j >= 0; j--) {
                sum += arr[j];
                currentMax = Math.max(sum, currentMax);
            }
            globalMax = Math.max(currentMax, globalMax);
        }

        return globalMax;
    }

    static int kadane(int[] arr) {

        int sum = 0;
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            if (sum > max) {
                max = sum;
            }
            if (sum < 0)
                sum = 0;
        }
        return max;
    }

}
