package DSA;

public class SetNthBit {
    public static void main(String[] args) {
        int n = 17;
        int i = 3;
        int ans = bitSet(n,i);
        System.out.println(ans);
    }
    static int bitSet(int n, int i)
    {
        return  n|(1<<(i-1));

    }
}
