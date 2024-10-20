package DSA;

public class ARaisedToPowerB {
    public static void main(String[] args) {
        int a = 8;
        int b = 6;
        int ans = computePower(a,b);
        System.out.println(ans);
    }
    static int computePower(int a, int b)
    {
        int ans = 1;
        int base = a;
        int bit = 0;
        do
        {
            bit = b & 1;
            if(bit == 1)
                ans *= base;
            base *= base;
            b >>=1;
        }while(b>0);
        return ans;
    }
}
