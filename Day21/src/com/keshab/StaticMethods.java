package com.keshab;

import static java.lang.Class.forName;

class SmartPhone
{
    int price;
    String brand;
    static String name;

    static
    {
        name = "Phone";
        System.out.println("In static block");
    }
    public SmartPhone()
    {
        brand = "";
        price = 200;
        System.out.println("In Constructor");
    }
    public void show()
    {
        System.out.println("Its non static method with price: "+this.price+" brand: "+this.brand+" name: ");
    }
//    public static void show1()
//    {
//        System.out.println("Its static method.");
//    }
}
public class StaticMethods {
    public static void main(String[] args) throws ClassNotFoundException {
        forName("SmartPhone");

//        Class.forName("SmartPhone");
//        SmartPhone.show1();
//        SmartPhone obj1 = new SmartPhone();
//        obj1.price = 1500;
//        obj1.brand = "Samsung";
//
//        SmartPhone obj2 = new SmartPhone();
//        obj2.price = 500;
//        obj2.brand = "Apple";
//
//        obj2.show();
        //        SmartPhone obj2 = new SmartPhone();
//        obj2.price = 1400;
//        obj2.brand = "Apple";
//
//        obj1.show();

    }
}
