package DSA;

public class Main {
    public static void main(String[] args) {
        int num = 81;
        int n = 4;
        int ans = FindRoot(num,n);
        System.out.println(ans);

    }
    public static int FindRoot(int num, int n)
    {
        if(num==1)
            return 1;

        int low = 1;
        int high = num;

        while(low<=high)
        {
            int mid = low+(high-low)/2;
            int result = CheckIfCoorect(num,n,mid);
            if(result==1)
                return mid;
            else if(result == 0)
                low = mid+1;
            else
                high = mid-1;
        }
        return -1;
    }
    public static int CheckIfCoorect(int num, int n, int mid)
    {
        long ans = 1;
        for(int i=1;i<=n;i++)
        {
            ans *= mid;
            if(ans>num)
                return 2;
        }
        if(ans == num)
            return 1;
        else
            return 0;
    }
}
