package DSA;

public class NumberOfSetBits {
    public static void main(String[] args) {
        int number = 241;
        int bits = findSetBits(number);
        System.out.println(bits);
    }
    static int findSetBits(int number)
    {
        int count = 0;
        int bit ;
        while(number>0)
        {
            bit = number & 1;
            if(bit == 1)
                count ++;
            number >>= 1;
        }
        return count;
    }
}
