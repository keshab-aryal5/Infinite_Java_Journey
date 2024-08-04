package com.keshab;

class MyFacto
{
    static long Factorial(int n)
    {
        if(n>=1)
        {
            return n*Factorial(n-1);
        }
        else
        {
            return 1;
        }
    }
}
public class QuickQuiz
{
    public static long Facto(int n)
    {
        if(n>=1)
        {
            return n*Facto(n-1);
        }
        else
        {
            return 1;
        }
    }
    public static void main(String[] args) {
        int n =5;
        System.out.println(MyFacto.Factorial(n));
    }
}
