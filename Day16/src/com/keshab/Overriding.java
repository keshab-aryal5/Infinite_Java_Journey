package com.keshab;
class A
{
    public int a;
    public int keshab()
    {
        return 4;
    }
    public void meth2()
    {
        System.out.println("I am method2 of classA");
    }
}
class B extends A
{

    public void meth2()
    {
        System.out.println("I am meth2 of class B");
    }
    public void meth3()
    {
        System.out.println("I am method3 of classB");
    }
}
public class Overriding {
    public static void main(String[] args) {
         A a = new A();
         a.meth2();

         B b = new B();
         b.meth2();
    }
}
