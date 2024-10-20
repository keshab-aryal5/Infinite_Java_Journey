package DSA;

public class XorInRange {
    public static void main(String[] args) {
        int a = 7;
        int b = 9;
        int ans = findXor(a, b);
        System.out.println(ans);
    }
    static int findXor(int a, int b)
    {
        int zeroTillB;
        if(b%4 == 0)
            zeroTillB = b;
        else if(b%4 == 1)
            zeroTillB = 1;
        else if(b%4 ==2)
            zeroTillB = b+1;
        else
            zeroTillB = 0;

        int zeroTillA;
        a = a-1;
        if(a%4 == 0)
            zeroTillA = a;
        else if(a%4 == 1)
            zeroTillA = 1;
        else if(a%4 ==2)
            zeroTillA = a+1;
        else
            zeroTillA = 0;

        System.out.println(zeroTillB);
        System.out.println(zeroTillA);
        return zeroTillB - zeroTillA;

    }
}
