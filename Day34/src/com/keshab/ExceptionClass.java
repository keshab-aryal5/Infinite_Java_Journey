package com.keshab;

class MyException extends Exception
{
    @Override
    public String toString()
    {
        return super.toString()+"I am toString()";
    }
    @Override
    public String getMessage()
    {
        return super.getMessage()+" I am getMessage()";
    }

}
public class ExceptionClass {
    public static void main(String[] args) throws MyException {
        int a = 8;
        if(a<99)
        {
            throw new MyException();
        }
    }
}
