package com.keshab;
class Car
{
    public  void drive()
    {
        System.out.println("Driving from car");
    }
    public void playMusic()
    {
        System.out.println("play music");
    }

}
class WagonR extends Car
{
    public void drive()
    {
        System.out.println("Driven by wagonR");
    }
}
public class Abstraction {
    public static void main(String[] args) {
        Car r1 = new WagonR();
        r1.drive();

    }
}
