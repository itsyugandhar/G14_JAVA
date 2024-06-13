import java.util.*;

public class Countinversionsmergesort{
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the array size:");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.print("enter the elements:");
        for(int i=0;i<n;i++){
              arr[i]=sc.nextInt();
        }
        int[] temp = new int[n];
        int ans = mergeSort(arr, temp, 0, n - 1);
        System.out.println("Number of inversions are: " + ans);
    }

    public static int merge(int arr[], int temp[], int left, int mid, int right) {
        int i, j, k;
        int count = 0;
        i = left;
        j = mid;
        k = left;
        while ((i <= mid - 1) && (j <= right)) {
            if (arr[i] <= arr[j]) {
                temp[k++] = arr[i++];
            } else {
                temp[k++] = arr[j++];
                count += (mid - i);
            }
        }
        while (i <= mid - 1) {
            temp[k++] = arr[i++];
        }
        while (j <= right) {
            temp[k++] = arr[j++];
        }
        for (i = left; i <= right; i++) {
            arr[i] = temp[i];
        }
        return count;
    }

    public static int mergeSort(int arr[], int temp[], int left, int right) {
        int mid, count = 0;
        if (right > left) {
            mid = (right + left) / 2;
            count += mergeSort(arr, temp, left, mid);
            count += mergeSort(arr, temp, mid + 1, right);
            count += merge(arr, temp, left, mid + 1, right);
        }
        return count;
    }
}

