package com.assignment;

public class Question5 {
    static int NthFibo(int n)
    {
        if(n==1)
            return 0;
        else if(n==2)
            return 1;
        else
            return (NthFibo(n-1)+NthFibo(n-2));
    }
    public static void main(String[] args) {
        System.out.println(NthFibo(8));
    }
}
