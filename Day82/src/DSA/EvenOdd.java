package DSA;

public class EvenOdd {
    public static void main(String[] args) {
        int a = 8256;
        if(isEvenOr(a))
        {
            System.out.println("Yes "+a+" is even");
        }
        else
        {
            System.out.println("No "+a+" is odd");
        }
    }
    static boolean isEvenAnd(int a)
    {
        if((a & 1) == 1)
            return false;
        else
            return true;
    }
    static boolean isEvenOr(int a)
    {
        if((a|1) == a)
            return false;
        else
            return true;
    }
}
