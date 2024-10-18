package DSA;

public class NthMagicNumber {
    public static void main(String[] args) {
        int n = 10;
        int magic = findMagic(n);
        System.out.println(magic);
    }
    static int findMagic(int n)
    {
        int result = 0;
        int count = 1;
        while(n>0)
        {
            if((n&1) == 1)
                result += Math.pow(5,count);
            count++;
            n >>= 1;
        }
        return result;
    }
}
