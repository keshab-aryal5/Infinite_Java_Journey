package DSA;

public class BouquetsMakingDays {
    public static void main(String[] args) {
        int bloomDay[] = new int[] {1,10,3,10,2};
        int m = 3, k = 1;
        int ans = minDays(bloomDay,m,k);
        System.out.println(ans);
    }
    public static int minDays(int[]bloomDay,int m, int k)
    {
        int low , high, ans, mid;
        if(m>bloomDay.length/k)
            return -1;
        low = minArray(bloomDay);
        high = maxArray(bloomDay);
        while(low<=high)
        {
            mid = low+(high-low)/2;
            ans = checkIfFeasible(bloomDay,m,k,mid);
            if(ans == 0)
                high = mid-1;
            else
                low = mid+1;
        }
        return low;
    }
    public static int checkIfFeasible(int[]bloomDay, int m, int k , int mid)
    {
        int flow = 0, boq = 0;
        for(int i: bloomDay)
        {
            if(i>mid)
                flow = 0;
            else
            {
                flow ++;
                if(flow == k)
                {
                    boq ++;
                    flow = 0;
                }
                if(boq == m)
                    return 0;
            }
        }
        return -1;
    }
    public static int minArray(int[] bloomDay)
    {
        int low = Integer.MAX_VALUE;
        for(int i:bloomDay)
        {
            low = Math.min(low,i);
        }
        return low;
    }
    public static int maxArray(int[] bloomDay)
    {
        int high = Integer.MIN_VALUE;
        for(int i:bloomDay)
        {
            high = Math.max(high,i);
        }
        return high;
    }
}
