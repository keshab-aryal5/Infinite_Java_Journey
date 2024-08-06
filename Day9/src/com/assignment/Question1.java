package com.assignment;

public class Question1 {
    static void Table(int n)
    {
        for(int i=1;i<=10;i++)
            System.out.println(n+"X"+i+" = "+ n*i);
    }
    public static void main(String[] args) {
        int num = 56;
        Table(num);
    }
}
