package com.keshab;
import java.util.Scanner;
abstract class Base2
{
    public Base2()
    {
        System.out.println("I am a constructor of Base2");
    }
    public void SayHello()
    {
        System.out.println("Say Hello");
    }
    public abstract void greet2();
    public abstract  void greet();
}
class Child2 extends Base2
{

    public void greet()
        {
            System.out.println("Hello");
        }

        public void greet2()
        {
            System.out.println("Hi there");
        }
}
abstract class MyClass2 extends Child2
{
    public void greet()
    {
        System.out.println("HI");
    }
}
public class Main {
    public static void main(String[] args) {

    }
}
