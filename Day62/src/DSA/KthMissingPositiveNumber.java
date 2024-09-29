package DSA;

public class KthMissingPositiveNumber {
    public static void main(String[] args) {
        int[] arr = new int[]{1,2,3,4};
        int k = 2;
        System.out.println(findMissing(arr,k));
    }
    public static int findMissing(int[]arr,int k)
    {
        int low, high,mid,ans;
        low = 0;
        high = arr.length-1;
        while(low<=high)
        {
            mid = low +(high-low)/2;
            ans = checkIfFits(arr,k,mid);
            if(ans==0)
                low = mid+1;
            else
                high = mid-1;
        }
        return high+k+1;
    }
    public static int checkIfFits(int[]arr,int k, int mid)
    {
        int missing;
        missing = arr[mid]-(mid+1);
        if(missing<=k)
            return 0;
        else
            return 1;

    }
}
