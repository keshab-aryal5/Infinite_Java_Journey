package com.Assignment;

public class Question2 {
    public static void add(int i)
    {
        System.out.println(i++);
    }
    public static void main(String[] args) {
        try
        {
//            int c = 5/0;
//            int d = "Hello";
//            add("keshab");
        }
        catch(ArithmeticException e)
        {
            System.out.println("Haha");
        }
        catch(IllegalArgumentException e)
        {
            System.out.println("HeHe");
        }
    }
}
