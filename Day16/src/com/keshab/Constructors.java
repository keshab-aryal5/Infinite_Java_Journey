package com.keshab;
class Base1
{
    Base1()
    {
        System.out.println("I am a constructor of Base1");
    }
    Base1(int a)
    {
        System.out.println("I am a constructor of Base1 with a value of "+a);
    }
    public int x;

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }
}
class Derived1 extends Base1
{
    Derived1()
    {
//        super(0);
        System.out.println("I am a constructor of Derived1");
    }
    Derived1(int a)
    {
        super(a);
        System.out.println("Iam a prameterized constructor of Dervied1");
    }
    public int y;

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}
class Derived11 extends Derived1
{
    Derived11()
    {
        System.out.println("I am derived class from Derived1");
    }
    Derived11(int a)
    {
        super(a);
        System.out.println("I am parameterized constructor of Derived11");
    }
}
public class Constructors {
    public static void main(String[] args) {
//        Base1 b = new Base1();
//        Derived1 d = new Derived1();
        Derived11 d11 = new Derived11(5);
    }

}
