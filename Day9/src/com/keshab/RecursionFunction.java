package com.keshab;

public class RecursionFunction {
    static int Factorial(int num)
    {
        if(num==0)
            return 1;
        else
            return num*Factorial(num-1);
    }
    public static void main(String[] args) {
        int mynumber = 4;
        System.out.println(Factorial(mynumber));
    }
}
