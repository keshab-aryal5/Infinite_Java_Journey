package com.keshab;
class A
{
    public void show()
    {
        System.out.println("In A show");
    }
    public void dontShow()
    {
        System.out.println("Dont show from A");
    }

}
class B extends A
{
    public void show()
    {
        System.out.println("In B Show");
    }
}
public class Streak {
    public static void main(String[] args) {
        B b = new B();
        b.show();

        A a = new A();
        a.show();

        A ab = new A();
        ab.show();
        ab.dontShow();
    }
}
