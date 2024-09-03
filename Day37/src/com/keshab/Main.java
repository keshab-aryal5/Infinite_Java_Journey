package com.keshab;
import java.util.InputMismatchException;
import java.util.Scanner;
class InvalidInputException extends Exception
{
    @Override
    public String toString()
    {
        return "Invalid input given";
    }

}
class DivideByZeroException extends Exception
{
    @Override
    public String toString()
    {
        return "Cann't perform division by 0";
    }
}
class MaxInputException extends Exception
{
    @Override
    public String toString()
    {
        return "Input cann't be greater than 10000";
    }

}
class MaxMultiplierException extends Exception
{
    @Override
    public String toString()
    {
        return "Multiplier cann't be greater than 7000";
    }
}
class InvalidOperatorException extends Exception
{
    @Override
     public String toString()
    {
        return "Invalid operator provided";
    }
}

public class Main {
    public static void main(String[] args) {
        boolean status = true;
        Scanner sc = new Scanner(System.in);
        while(status)
        {
            try
            {
                System.out.print("Enter you first number: ");
                float a = sc.nextFloat();

                String chh = sc.nextLine();
                System.out.print("Enter your operator (+,-,/,*): ");
                String c = sc.nextLine();
                char ch = c.charAt(0);
                System.out.print("Enter you second number: ");
                float b = sc.nextFloat();


                if(a>10000 || b>10000)
                    throw new MaxInputException();
                else
                {
                    if(ch=='+')
                        System.out.println(a+b);
                    else if(ch=='-')
                        System.out.println(a-b);
                    else if(ch=='*')
                    {
                        if(a>7000 || b>7000)
                            throw new MaxMultiplierException();
                        else
                            System.out.println(a*b);
                    }
                    else if (ch=='/')
                    {
                        if(b==0.0)
                            throw new DivideByZeroException();
                        else
                            System.out.println(a/b);
                    }
                    else
                        throw new InvalidOperatorException();
                }
            }
            catch(InvalidOperatorException e)
            {
                System.out.println(e);
            }
            catch(DivideByZeroException e)
            {
                System.out.println(e);
            }
            catch(MaxInputException e)
            {
                System.out.println(e);
            }
            catch(MaxMultiplierException e)
            {
                System.out.println(e);
            }
            catch(InputMismatchException e)
            {
                System.out.println("Invalid input provided");
            }
        }
    }
}
