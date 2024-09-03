package com.keshab;

import java.util.Scanner;

class MyException extends Exception
{
    @Override
    public String toString()
    {
        return "I am toString()";
    }
    @Override
    public String getMessage()
    {
        return super.getMessage()+" I am getMessage";
    }

}
public class ExceptionClass {
    public static void main(String[] args) {
        int a = 8;
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        if(a<99)
        {
            try
            {
                throw new MyException();
            }
            catch(Exception e)
            {
                System.out.println(e);
                e.printStackTrace();
            }
        }
    }
}
