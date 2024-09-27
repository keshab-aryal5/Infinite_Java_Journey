package DSA;

public class MinimumDivisor {
    public static void main(String[] args) {
        int nums[] = new int[]{1,2,5,9};
        int threshold = 6;
        System.out.println(smallestDivisor(nums,threshold));
    }
    public static int smallestDivisor(int[] nums, int threshold) {
        int low = 1;
        int high = maxArray(nums);
        while(low<=high)
        {
            int mid = low+(high-low)/2;
            int ans = checkIfCorrect(nums, threshold,mid);
            if(ans==0)
                high = mid-1;
            else
                low = mid+1;
        }
        return low;
    }
    public static int checkIfCorrect(int[]nums,int threshold, int mid)
    {
        int sum = 0;
        for(int i: nums)
        {
            sum += Math.ceil((double)i/(double)mid);
        }

        if(sum<=threshold)
            return 0;
        else
            return 1;
    }
    public static int maxArray(int[]nums)
    {
        int max = Integer.MIN_VALUE;
        for(int i: nums)
            max = Math.max(max,i);
        return max;
    }
}
