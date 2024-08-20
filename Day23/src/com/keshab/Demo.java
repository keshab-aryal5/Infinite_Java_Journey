package com.keshab;
class Laptop
{
     String model;
     int price;
    public void show()
    {
        System.out.println("In A show");
    }
    public String toString()
    {
        System.out.println("Hey");
        return "Keshab";
    }
    public boolean equals(Laptop that)
    {
        if(this.model.equals(that.model) && this.price == that.price)
            return true;
        else
            return false;
    }

}
//class B extends A{
//public void sho()
//{
//    System.out.println("HII");
//}
//}

public class Demo {
    public static void main(String[] args) {
//        B obj = new B();
//        obj.show();
//        A obj1 = new B();
////        obj1.sho();
//        final int num = 8;
////        num = 9;
//        System.out.println(num);
         Laptop obj = new Laptop();
         obj.model = "Lenovo Yoga";
         obj.price = 1000;

        Laptop obj2 = new Laptop();
        obj2.model = "Lenovo Yoga";
        obj2.price = 1000;

        System.out.println(obj.equals(obj2));


//        System.out.println(obj.toString());
    }
}
