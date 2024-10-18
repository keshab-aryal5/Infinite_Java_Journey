package DSA;

public class ResetNthBit {
    public static void main(String[] args) {
        int n = 86;
        int ans = resetMe(n,5);
        System.out.println(ans);
    }
    static int resetMe(int n,int i)
    {
        int setNumber = 1<<(i-1);
//        int resetNumber = !setNumber;
        return 0;
    }
}
