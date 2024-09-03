package com.keshab;

class NegativeRadiusException extends Exception
{
    public String toString()
    {
        String message = "Radius cann't be negative";
        return message;
    }
    public String getMessage()
    {
        return "Radius cann't be negative";
    }
}

public class ThrowThrows {
    public static double area(int r) throws NegativeRadiusException
    {
        if(r<0)
            throw new NegativeRadiusException();
        double result = Math.PI*r*r;
        return result;
    }
    static int divide(int a, int b) throws ArithmeticException
    {
        int result = a/b;
        return result;
    }
    public static void main(String[] args) {
        try
        {
            int c = divide(6,0);
            System.out.println(c);
        }
        catch(Exception e)
        {
            System.out.println("Exception");
        }
        try
        {
            double ar = area(6);
        }
        catch(Exception e)
        {
            System.out.println("Exception caught");
        }
    }
}
