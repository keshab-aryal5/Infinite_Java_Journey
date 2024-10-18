package DSA;

public class PowerOfTwo {
    public static void main(String[] args) {
        int num = 64;
        System.out.println(isPowerOfTwo(num));
        System.out.println(6>>1);
    }
    static boolean isPowerOfTwo(int n)
    {
        return (n&(n-1)) == 0;
    }
}
