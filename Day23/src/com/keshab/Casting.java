package com.keshab;

class A
{
    public void show1()
    {
        System.out.println("In a show");
    }
}
class B extends A
{
    public void show2()
    {
        System.out.println("In b show");
    }
}
public class Casting {
    public static void main(String[] args) {
        A obj =(A) new B();

        obj.show1();


        B obj1 =(B) new A();



    }
}
