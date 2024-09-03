package com.keshab;

public class ThrowKeyWord {
    public static void main(String[] args) {
        int i = 20;
        int j = 0;

        try
        {
            j = 18/i;
        }
        catch(ArithmeticException e)
        {
           j = 18/1;
            System.out.println("Default output triggered.");
        }
        catch(Exception e)
        {
            System.out.println("Something went wrong"+e);
        }
        System.out.println(j);
        System.out.println("Bye");
    }
}
