package DSA;
import java.util.Arrays;
public class AggressiveCow {
    public static void main(String[] args) {
        int[]position = new int[]{1,2,3,4,7};
        int m = 3;
        System.out.println(maxDistance(position,m));
    }
        public static int maxDistance(int[] position, int m) {
            Arrays.sort(position);
            int low = 0;
            int high = position[position.length-1]-position[0];
            while(low<=high)
            {
                int mid = low + (high-low)/2;
                int ans = checkIfFeasible(position,m,mid);
                if(ans==0)
                    low = mid+1;
                else
                    high = mid-1;
            }
            return high;
        }
        public static int checkIfFeasible(int[]arr,int m, int mid)
        {
            int cowcount = 1;
            int lastcount = 0;
            for(int i = 1;i<arr.length;i++)
            {
                if(arr[i]-arr[lastcount] >=mid)
                {
                    cowcount++;
                    lastcount = i;
                }
                else
                    continue;
            }
            if(cowcount >= m)
                return 0;
            else
                return 1;
        }
}
