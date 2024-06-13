package medium;
import java.util.ArrayList;
import java.util.List;
public class spiral {

    static List<Integer> spiralOrder(int [][]arr){
        List<Integer> ans = new ArrayList<Integer>();
        if(arr.length == 0){
            return ans;
        }
        int ml = arr.length , nl = arr[0].length;
        boolean[][] seen = new boolean[ml][nl];
        int [] xr = {0,1,0,-1};
        int  [] xc = {1,0,-1,0};

        int x = 0 ,y = 0, xi = 0;
        for(int i =0 ;  i<ml*nl ; i++){
            ans.add(arr[x][y]);
            seen[x][y] =true;
            int dr =x+xr[xi];
            int dc = y+xc[xi];

            if(0<=dr && dr <ml && 0<=dc && dc<nl && !seen[dr][dc]){
                x = dr;
                y = dc;
            }
            else{
                xi = (xi+1)%4;
                x = x+xr[xi];
                y = y+xc[xi];
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int arr[][] = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};

        System.out.println(spiralOrder(arr));
    }
}
