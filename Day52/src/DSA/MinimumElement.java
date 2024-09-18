package DSA;

import static java.sql.Types.INTEGER;

public class MinimumElement {
    public static void main(String[] args) {
        int[]arr = new int[]{4,5,6,7,-767,1,2};
        System.out.println(FindMinimum(arr));
    }
    static int FindMinimum(int[]arr)
    {
        int low = 0;
        int high = arr.length-1;
        int min = Integer.MAX_VALUE;
        while(low<=high)
        {
            int mid  = low+(high-low)/2;
            if(arr[mid]>=arr[low])
            {
                if(arr[low]<min)min = arr[low];
                low = mid+1;
            }
            else
            {
                if(arr[mid]<min)min = arr[mid];
                high = mid-1;
            }
        }
        return min;
    }
}
