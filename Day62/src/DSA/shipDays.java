package DSA;

public class shipDays {
    public static void main(String[] args) {
        int[] weights = new int[]{1,2,3,4,5,6,7,8,9,10};
        int days = 5;
        System.out.println(shipWithinDays(weights, days));
    }
    public static int shipWithinDays(int[]weight, int days)
    {
        int low, high,mid,ans,capacity=0;
        low = 1;
        high = sumArray(weight);
        while(low<=high)
        {
            mid = low+(high-low)/2;
            ans = checkIfFeasible(weight,days,mid);
            if(ans == 0)
            {
                capacity = mid;
                high =  mid-1;
            }
            else
                low = mid+1;
        }
        return low;
    }
    public static int checkIfFeasible(int[]weight,int days,int mid)
    {
        int sum = 0,count = 1;
        for(int w: weight)
        {
            if(w>mid)
                return -1;
            else
            {
                if(sum+w > mid)
                {
                    count ++;
                    sum = w;
                }
                else
                {
                    sum+= w;
                }
            }
        }
        if(count <= days)
            return 0;
        else
            return -1;

    }
    public static int sumArray(int[] weight)
    {
        int sum = 0;
        for(int w: weight)
            sum += w;
        return sum;
    }
}
