public class Maxconsecutiveones{
    public static void main(String args[])
    {
        int arr[]={1,1,0,1,1,1};
        System.out.println(MaxConsOnes(arr));

    }
    public static int MaxConsOnes(int arr[])
    {
        int curr_count=0;
        int max_count=0;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==1)
            {
                curr_count++;
                max_count=Math.max(max_count,curr_count);
            }
            else{
                curr_count=0;

            }

        }
        return max_count;

    }
}