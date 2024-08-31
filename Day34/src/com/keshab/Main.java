package com.keshab;

public class Main {
    public static void main(String[] args) {
        int a = 6000;
        int b = 0;
        try
        {
            int c = a/b;
            System.out.println("The result is "+c);
        }
        catch (Exception e)
        {
            System.out.println("we failed to divide. Reason: ");
            System.out.println(e);
        }

    }
}
