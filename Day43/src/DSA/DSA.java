package DSA;

import java.util.Arrays;

public class DSA {
    public static int searchIndex(int[] arr, int target,boolean starting)
    {
        int ans = -1;
        int low = 0, high = arr.length-1;
        while(low<=high)
        {
            int mid = low+(high-low)/2;
            if(arr[mid]==target)
            {
                ans = mid;
                if(starting)
                    high = mid-1;
                else
                    low = mid+1;
            }
            else if(arr[mid]>target)
                high = mid-1;
            else
                low = mid+1;
        }
        return ans;
    }
    public static void main(String[] args)
    {
        int arr[] = {5,7,7,8,8,8,8,8,8,8,10};
        int target = 8;
        int end;
        int[] ans = new int[]{-1,-1};
        ans[0] = searchIndex(arr,target,true);
        if(ans[0] != -1)
            ans[1] = searchIndex(arr,target,false);
        System.out.println(Arrays.toString(ans));
    }
}
