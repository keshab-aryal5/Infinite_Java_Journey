package com.assignment;

public class Question7 {
    static void PrintPattern(int n)
    {
        if(n==1)
            System.out.println("*");
        else
        {
            for(int i=n;i>=1;i--)
                System.out.print("* ");
            System.out.println();
            PrintPattern(n-1);
        }
    }
    public static void main(String[] args) {
        PrintPattern(15);
    }
}
