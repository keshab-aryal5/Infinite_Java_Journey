package DSA;

public class koko_Banana {
    public static void main(String[] args) {
        int[] piles = new int[]{312884470};
        int h = 312884469;
        int s = minEatingSpeed(piles,h);
        System.out.println(s);
    }
    public static int minEatingSpeed(int[]piles,int h)
    {
        int low = 1;
        int high = maxPiles(piles);
        while(low<=high)
        {
            int mid = low+(high - low)/2;
            int ans = checkIfSatisfies(piles,h,mid);
            if(ans <= h)
            {
                high = mid-1;
            }
            else
            {
                low = mid+1;
            }
        }
        return low;
    }
    static int checkIfSatisfies(int[]piles, int h, int mid)
    {
        int hrs = 0;
        for(int i: piles)
            hrs += Math.ceil((double)i/(double)mid);
        return hrs;
    }
    public static int maxPiles(int[]piles)
    {
        int max = Integer.MIN_VALUE;
        for(int i: piles)
            max = Math.max(max,i);
        return max;
    }
}
