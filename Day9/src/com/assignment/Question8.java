package com.assignment;

public class Question8 {
    static void PrintPattern(int n) {
        if(n>0)
        {
            PrintPattern(n-1);
            for(int i=1;i<=n;i++)
                System.out.print("* ");
            System.out.println();
        }
    }
    public static void main(String[] args) {
        PrintPattern(5);
    }
}
