Question 1:

import java.util.Scanner;

public class sum {
    public static void main(String[] args) {
        int arr[]={2,3,8,5,6,7,1,9,3};
        int sum = 0;
        int l=arr.length;
        for(int i=0;i<l;i++)
        {
            sum=sum+arr[i];

        }
        System.out.println("the sum of values of array is:"+sum);
    }
    
}


Output: 
the sum of values of array is:44
question 2

package esay;

import java.util.Scanner;

public class sum {
    public static void main(String[] args) {
        int arr[]={2,3,8,5,6,7,1,9,3};
        int avg = 0;
        int l=arr.length;
        for(int i=0;i<l;i++)
        {
            avg=avg+arr[i];

        }
        avg=avg/l;
        System.out.println("the average of values of array is:"+avg);
    }
    
Output:
 

Question 3

package esay;
import java.util.Arrays;
public class del_el {
    public static void main(String[] args) {
        int arr[] = {55,44,88,99,11,25,47,85,36,21,45,11,24,5}; 
   System.out.println("Original Array : " + Arrays.toString(arr));            
        int Index = 5;
        for (int i = Index; i < arr.length - 1; i++) {
            arr[i] = arr[i + 1];
        }
        System.out.println("After removing the sixth element: " + Arrays.toString(arr));
    }
    
}

Output:
 

Question 4:
package esay;
import java.util.Arrays;
public class reverse {
    public static void main(String[] args) {
        int arr[]={5,47,8,9,62};
        int low=0,high=arr.length-1;
        int temp=0;
        System.out.println("Original Array : " + Arrays.toString(arr));    
        while(low<high){
            temp=arr[low];
            arr[low]=arr[high];
            arr[high]=temp;
            low++;
            high--;
        }
        System.out.println("reverse is: ");
        for(int i:arr){
            System.out.print(+i+" ");
        }
    }
}
    



Output:
 


Question 5:
package esay;
import java.util.Arrays;

public class dupe 
{
    public static void main(String[] args) {
        int[] arr = {4,1,5,2,5,1,3,6,4,2};
     for (int i = 0; i < arr.length-1; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if ((arr[i] == arr[j]) && (i != j)) {
                    System.out.println("Duplicate Element : " + arr[j]);
                }
            }
        }
    }    
}

    

 

Question 6:
package esay;
import java.util.Arrays;
public class removedupeinarray {
    public static void main(String[] args) {
        int a[]={1,2,4,4,5,5,3};
        System.out.println("Original Array : " + Arrays.toString(a));    
        int l=a.length;
        int []temp=new int[l];
        int j=0;
        for(int i=0;i<l-1;i++)
        {
            if (a[i] != a[i + 1]) {
                temp[j++] = a[i];
        }

    }
    temp[j++]=a[l-1];
   
    System.out.println("modified Array : " + Arrays.toString(temp));    

    
}
}


 
Question7:
package esay;
import java.util.Arrays;
public class secl_argest 
{
    public static void main(String[] args) {
        
    
    int a[]={4,5,7,8,6,1,2,3};
    System.out.println("Original Array : " + Arrays.toString(a));    
    int l=a.length;
    for(int i=0;i<l-1;i++)
    for(int j=0;j<l-i-1;j++)
    if(a[j]>a[j+1])
    {
        int t=a[j];
        a[j]=a[j+1];
        a[j+1]=t;
    }
    System.out.println("second largest element is: "+a[l-2]);

}     
}

 
Question 8:
package esay;
import java.util.Arrays;
public class equalarray {
    public static void main(String[] args) {
     int a[]={8,5,2};
     int b[]={8,5,2};
     Arrays.sort(a);
Arrays.sort(b);

     boolean equal=true;
     int al=a.length;
     int bl=b.length;
       if(al==bl)
       {
        for (int i=0;i<al;i++)
        {
            if(a[i]==b[i])
            continue;
            else{
                equal=false;
            }
        }
        if(equal)
        System.out.println("the arrays are equal");
        else
        System.out.println("not equal");
    }
    }
    
}


 

Question 9:
import java.io.*;
import java.util.*;
 
public class misssing {
    public static void main(String[] args)
    {
        int arr[] = { 1, 3, 7, 5, 6, 2 };
        int n = arr.length;     
        
    {
        int i;
        int temp[] = new int[n + 1];
        for (i = 0; i <= n; i++) {
            temp[i] = 0;
        }
 
        for (i = 0; i < n; i++) {
            temp[arr[i] - 1] = 1;
        }
 
        int ans = 0;
        for (i = 0; i <= n; i++) {
            if (temp[i] == 0)
                ans = i + 1;
        }
        System.out.println(ans);
    }
    
    }

    
}

 
Question 10:
package esay;

import java.util.Arrays;

public class move {
    public static void main(String[] args) {
        int a[]={1,0,2,0,0,6,8,0,2};
        System.out.println("original array"+Arrays.toString(a));
        int l=a.length;
        int a1[]=new int[l];
        int front=0;
        int back=l-1;
        for(int i=0; i<l;i++)
        {
            if(a[i]==0){
                a1[back]=a[i];
                back--;
            }
            else{
                a1[front]=a[i];
                front++;
            }

        }
        System.out.println("after manipulation"+Arrays.toString(a1));
    }
    
}


 
Question 10:
package esay;
import java.util.Arrays;
public class sumequal10 {
    public static void main(String[] args) {
        int a[]={10,5,7,20,35};
        int l=a.length;
        int sum =0;
        boolean test=false;
        System.out.println("Array is"+Arrays.toString(a));
        for(int i=0;i<l;i++)
        {
            if(a[i]%10==0)
            {
                sum=sum+a[i];
            }
            else 
            continue;

        }
        if(sum==30)
       test=true;
        System.out.println(test);

    }
}


 
 
 Medium Questions
Question 1:
package medium;
import java.util.Arrays;
public class max1 {
    public static void main(String[] args) {
        int a[]={1,1,0,1,1,1,0,0,1,1};
        System.out.println(Arrays.toString(a));
        int l=a.length;
        int c=0;
        int f=0;
        for(int i=0;i<l;i++)
        {
            if(a[i]==1)
            c++;
            else{
                f=Math.max(f,c);
                c=0;
            }
        }
        System.out.println("max no of consecutive 1 is"+f);
    }
    
}


 

Question 2:
package medium;
import java.util.Arrays;
public class twosum {
    
    public static void main(String[] args) {
        
        int a[] = { 0, -1, 2, 3, 1 };
        int x = 3;
        int l=a.length;
        boolean result=false;
        for(int i=0;i<l-1;i++){
            for(int j=(i+1);j<l;j++)
            {
                if(a[i]+a[j]==x)
                result=true;
            }
        }
        if(result)
        System.out.println("yes");
        else
        System.out.println("false");

    }
}

 
Question 3:
package medium;
import java.util.Arrays;
public class sort012 {
    
    public static void main(String[] args) {
        int a[]={2,1,0,0,2,2,1,1,2,0,2,0,1,2};
        System.out.println(Arrays.toString(a));
       int l=a.length;
        int a1[]=new int[l];
        int start=0;
        int end=l-1;
       int t;
        for(int i=0;i<l && i<=end;)
        {
            if(a[i]==0)
            { 
              t= a[i];
            a[i]=a[start];
            a[start]=t;
            start++;
           i++;
            }
            else if(a[i]==2)
            {
                t=a[i];
                a[i]=a[end];
                a[end]=t;
                end--;
            }
            else
            i++;
        
        }
        System.out.println("sorted array:  "+Arrays.toString(a));
    }
}

 
Question 4:
package medium;
import java.util.Arrays;
public class majdupe {
   
    public int findMajorEle(int inputArr[])  
    {  
        int s = inputArr.length;  
          
        int count = 0;  
          
       
        for(int i = 0 ; i < s; i++)  
        {  
            
            for(int j = 0; j < s; j++)  
            {  
                if(inputArr[i] == inputArr[j])  
                {  
                    count = count + 1;  
                }  
            }  
              
            if(count > s / 2)  
            {  
                return inputArr[i];  
            }  
              
count = 0;  
        }  
          
        return -1;  
    }  
  
public static void main(String[] argvs)   
    {   majdupe obj = new majdupe();  
  
        int arr[] = {5, 1, 1, 1, 1, 1, 4, 9, 1, 0, 1, 2};  
          
        int s = arr.length;  
        System.out.println("For the input array.");  
        for(int i = 0; i < s; i++)  
        {  
            System.out.print(arr[i] + " ");  
        }  
        System.out.println();  
        int ans = obj.findMajorEle(arr);  
        if(ans != -1)  
        {  
           System.out.println("The majority element is: " + ans);   
        }  
        else  
        {  
            System.out.println("The majority element is not found.");   
        }  
          
          
        System.out.println("\n");  
          
        // another input array  
        int arr1[] = {47, 8, 1, 6, 3, 6, 90, 52, 78, 47, 47, 47};  
          
        s = arr1.length;  
        System.out.println("For the input array.");  
        for(int i = 0; i < s; i++)  
        {  
            System.out.print(arr1[i] + " ");  
        }  
        System.out.println();  
        ans = obj.findMajorEle(arr1);  
        if(ans != -1)  
        {  
           System.out.println("The majority element is: " + ans);   
        }  
        else  
        {  
            System.out.println("The majority element is not found.");   
        }  
          
          
    }  
}

 
Question 5:
package medium;

public class kadane {
    public static void main(String[] args) {
        int[] arr={-5,6,-3,-5,4,-2,6,-5,1,2,3,-1};
        int max=Integer.MIN_VALUE;
        int sum=0;
        for(int num:arr)
        {
            sum=Math.max(num,sum+num);
            sum=Math.max(max, sum);
        }
System.out.println("max contigous sum is: "+sum);
    }
    
}


 
Question 6:
package medium;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.*;
public class spiral {
   
    public static List<Integer> spiralOrder(int[][] matrix)
    {
        List<Integer> ans = new ArrayList<Integer>();

        if (matrix.length == 0)
            return ans;

        int m = matrix.length, n = matrix[0].length;
        boolean[][] seen = new boolean[m][n];
        int[] dr = { 0, 1, 0, -1 };
        int[] dc = { 1, 0, -1, 0 };
        int x = 0, y = 0, di = 0;
        for (int i = 0; i < m * n; i++) {
            ans.add(matrix[x][y]);
            seen[x][y] = true;
            int cr = x + dr[di];
            int cc = y + dc[di];

            if (0 <= cr && cr < m && 0 <= cc && cc < n
                && !seen[cr][cc]) {
                x = cr;
                y = cc;
            }
            else {
                di = (di + 1) % 4;
                x += dr[di];
                y += dc[di];
            }
        }
        return ans;
    }

    
    public static void main(String[] args)
    {
        int a[][] = { { 1, 2, 3, 4 },
                    { 5, 6, 7, 8 },
                    { 9, 10, 11, 12 },
                    { 13, 14, 15, 16 } };

        System.out.println(spiralOrder(a));
    }
}

    


 
Question 7:
package medium;

import java.util.HashMap;
import java.util.Map;

public class subarray {
     public static int subarraySum(int[] nums, int k) {
        int answer = 0, prefixSum = 0;
        Map<Integer, Integer> prefixSumsFrequency = new HashMap<>();
        prefixSumsFrequency.put(0, 1);
        for (int i = 0; i < nums.length; i++) {
            prefixSum += nums[i];
            answer += prefixSumsFrequency.getOrDefault(prefixSum - k, 0);
            prefixSumsFrequency.put(prefixSum, prefixSumsFrequency.getOrDefault(prefixSum, 0) + 1);
        }
        return answer;
    }
    public static void main(String[] args) {
        int[] nums = { 1, 2, 3 };
        int k = 3;
        System.out.println(subarraySum(nums, k));
    }
}


 
Hard:
Queation 1:
package hard;

public class pascals {
        
    public int factorial(int i)
    {
        if (i == 0)
            return 1;
        return i * factorial(i - 1);
    }
    public static void main(String[] args)
    {
        int n = 4, i, j;
        pascals g = new pascals();
        for (i = 0; i <= n; i++) {
            for (j = 0; j <= n - i; j++) {
 
                // for left spacing
                System.out.print(" ");
            }
            for (j = 0; j <= i; j++) {
 
                // nCr formula
                System.out.print(" "+g.factorial(i)/ (g.factorial(i - j)* g.factorial(j)));
            }
            System.out.println("");
}
    }
}

 
Question 2:
package hard;

public class triplet {

    static void findTriplets(int[] arr, int n)
    {
        boolean found = false;
        for (int i = 0; i < n - 2; i++) {
            for (int j = i + 1; j < n - 1; j++) {
                for (int k = j + 1; k < n; k++) {
                    if (arr[i] + arr[j] + arr[k] == 0) {
                        System.out.println(arr[i] + " "
                                           + arr[j] + " "
                                           + arr[k]);
                        found = true;
                    }
                }
            }
        }
 
        // If no triplet with 0 sum found in array
        if (found == false)
            System.out.println(" not exist ");
    }
 
    // Driver code
    public static void main(String[] args)
    {
        int arr[] = { 0, -1, 2, -3, 1 };
        int n = arr.length;
        findTriplets(arr, n);
    }
}


 
Question 3:
package hard;
import java.util.*;
public class fours {
    
  

  static class pairSum {
   public int first;
  public int sec;
  public int sum;
  }
 static boolean noCommon(pairSum a, pairSum b)
  {
    if (a.first == b.first || a.first == b.sec
        || a.sec == b.first || a.sec == b.sec)
      return false;
 
    return true;
  }
 static void findFourElements(int[] myArr, int sum)
  {
    int i, j;
    int length = myArr.length;
 int size = (length * (length - 1)) / 2;
    pairSum[] aux = new pairSum[size];
   int k = 0;
    for (i = 0; i < length - 1; i++) {
      for (j = i + 1; j < length; j++) {
        aux[k] = new pairSum();
        aux[k].sum = myArr[i] + myArr[j];
        aux[k].first = i;
        aux[k].sec = j;
        k++;
      }
    }
   Arrays.sort(aux, new Comparator<pairSum>() {
     public int compare(pairSum a, pairSum b)
      {
        return (a.sum - b.sum);
      }
    });
  i = 0;
    j = size - 1;
    while (i < size && j >= 0) {
      if ((aux[i].sum + aux[j].sum == sum)
          && noCommon(aux[i], aux[j])) {
        String output = myArr[aux[i].first] + ", "+ myArr[aux[i].sec] + ", "+ myArr[aux[j].first] + ", "+ myArr[aux[j].sec];
        System.out.println(output);
        return;
      }
      else if (aux[i].sum + aux[j].sum < sum)
        i++;
      else
        j--;
    }
  }
 
  public static void main(String[] args)
  {
    int[] arr = { 10, 20, 30, 40, 1, 2 };
    int X = 91;
   findFourElements(arr, X);
  }
}

 
Question 5:
package hard;

public class q4 {
    
    static int arr[] = new int[] { 1, 20, 6, 4, 5 };
 
    static int getInvCount(int n)
    {
        int inv_count = 0;
        for (int i = 0; i < n - 1; i++)
            for (int j = i + 1; j < n; j++)
                if (arr[i] > arr[j])
                    inv_count++;
 
        return inv_count;
    }
 
    // Driver method to test the above function
    public static void main(String[] args)
    {
        System.out.println("Number of inversions are "
                           + getInvCount(arr.length));
    }
}

 

