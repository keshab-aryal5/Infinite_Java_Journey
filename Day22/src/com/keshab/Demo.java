package com.keshab;

class A extends Object{
    public A()
    {
        System.out.println("In A");
    }
}
class B extends A{
    public B()
    {
        System.out.println("In B");
    }
}


public class Demo {
    public static void main(String[] args) {
//        B obj1 = new A();
        A obj = new B();
//        B obj = new A();

    }
}
