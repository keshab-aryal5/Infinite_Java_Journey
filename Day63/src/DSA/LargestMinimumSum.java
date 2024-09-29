package DSA;

public class LargestMinimumSum {
    public static void main(String[] args) {
        int[] nums = new int[]{7,2,5,10,8};
        int k = 2;
        System.out.println(largetMinimumSum(nums,k));
    }
    public static int largetMinimumSum(int[]nums,int k)
    {
        int low=Integer.MIN_VALUE,high=0,mid,sum,count;
        for(int num: nums)
        {
            low = Math.max(num,low);
            high += num;
        }
        while(low<=high)
        {
            sum = 0;
            count = 1;
            mid = low + (high-low)/2;
            for(int n: nums)
            {
                if(sum+n <= mid)
                    sum += n;
                else
                {
                    count ++;
                    sum = n;
                }
            }
            if(count>k)
                low = mid+1;
            else
                high = mid;
        }
        return high;
    }
}
