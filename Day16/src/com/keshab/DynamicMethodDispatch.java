package com.keshab;

class Phone
{
    public void name()
    {
        System.out.println("My name is Java");
    }
    public void greet()
    {
        System.out.println("Good morning");
    }
}
class SmartPhone extends Phone{
    public void swagat()
    {
        System.out.println("Aapka swagat hai");
    }
    @Override
    public void name()
    {
        System.out.println("My name is Java in class two");
    }
}
public class DynamicMethodDispatch {
    public static void main(String[] args) {
//        Phone obj = new Phone();
//        SmartPhone smobj = new SmartPhone();
//        obj.name();
        Phone obj = new SmartPhone();
        obj.name();
//        obj.swagat();




    }
}
