package com.keshab;

abstract class A
{
    int age;

    public abstract void show();

}

public class InnerClass {
    public static void main(String[] args) {
//        A ab = new B();
//        ab.show();
//        ab.how();
        A obj = new A()
        {
            public void show()
            {
                System.out.println("Hello this is anonymous class");
            }
        };
        obj.show();
    }
}
