package DSA;

public class SearchingInfinite {
    public static int findIndex(int[] arr, int start, int end,int target)
    {
        int ans = -1;
        while(start<=end)
        {
            int mid = start + (end-start)/2;
            if(arr[mid]==target)
                return mid;
            else if(arr[mid]>target)
                end = mid -1;
            else
                start = mid+1;
        }
        return ans;
    }
    public static void main(String[] args)
    {
        int arr[] = {1,12,122,124, 125, 169,269,369,469,569,669,769,869,969,1069};
        int target = 669;
        int start = 0;
        int end = 2;
        int ans = -1;
        while(ans == -1)
        {
            int temp = end;
            if(arr[end]>=target)
                ans = findIndex(arr,start,end,target);
            end = end+ (end-start+1 *2);
            start = temp+1;
        }
        System.out.println(ans);
    }
}
