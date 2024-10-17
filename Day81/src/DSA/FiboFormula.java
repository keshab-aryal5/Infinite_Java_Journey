package DSA;

public class FiboFormula {
    public static void main(String[] args) {
        for(int i =0;i<51;i++)
            System.out.println(findFibo(i));
    }
    static int findFibo(int n)
    {
       return (int) (Math.pow(((1+Math.sqrt(5))/2),n) / Math.sqrt(5));
    }
}
