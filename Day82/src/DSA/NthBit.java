package DSA;

public class NthBit {
    public static void main(String[] args) {
        int num = 182,pos = 5;
        System.out.println(ithBit(num,pos));
    }
    static int ithBit(int num, int pos)
    {
        return num&(1<<(pos-1));
    }
}
