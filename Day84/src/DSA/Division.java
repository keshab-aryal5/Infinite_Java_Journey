package DSA;

public class Division {
    public static void main(String[] args) {
        int dividend = 45;
        int divisor = 5;
        int shift =(int)(Math.log((double)divisor)/Math.log((double)2));
        System.out.println(dividend >> shift);

    }
}
