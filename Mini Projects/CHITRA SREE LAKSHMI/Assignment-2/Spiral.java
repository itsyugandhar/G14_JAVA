import java.util.*;

class Spiral {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the no of rows:");
        int m = sc.nextInt();
        System.out.print("enter the no of columns:");
        int n = sc.nextInt();
        int a[][] = new int[m][n];
        System.out.print("enter the elemnts:");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                a[i][j] = sc.nextInt();
            }
        }
        spiral(a, m, n);
    }

    public static void spiral(int a[][], int m, int n) {
        int i, r = 0, c= 0;

        while (r < m && c < n) {
            
            for (i = c; i < n; ++i) {
                System.out.print(a[r][i] + " ");
            }
            r++;

            
            for (i = r; i < m; ++i) {
                System.out.print(a[i][n - 1] + " ");
            }
            n--;

           
            if (r < m) {
                for (i = n - 1; i >= c; --i) {
                    System.out.print(a[m - 1][i] + " ");
                }
                m--;
            }

            
            if (c < n) {
                for (i = m - 1; i >= r; --i) {
                    System.out.print(a[i][c] + " ");
                }
                c++;
            }
        }
    }
}

