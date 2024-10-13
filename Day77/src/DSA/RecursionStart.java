package DSA;

public class RecursionStart {
    public static void main(String[] args) {
//        message(10,10);
        System.out.println(nthFibonacciNumber(10));
    }
    public static int nthFibonacciNumber(int n)
    {
        if(n==1)
            return 0;
        else if(n==2)
            return 1;
        else
        {
            return nthFibonacciNumber(n-1)+nthFibonacciNumber(n-2);
        }
    }
    public static void message(int n,int count)
    {
        if(count == 0)
            return;
        else
        {
            System.out.println(n+1);
            message(n+1,count-1);
        }
    }
}
