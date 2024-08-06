package com.assignment;

public class Question3 {
    static int SumNatural(int n)
    {
        int sum=0;
        int i = 1;
        while(i<=n)
        {
            sum += i;
            i++;
        }
        return sum;
    }
    public static void main(String[] args) {
        System.out.println(SumNatural(100));
    }
}
