package com.assignment;
abstract class Telephone
{
    public abstract void ring();
    public abstract void lift();
    public abstract void disconnect();
}
class SmartPhone extends Telephone
{
    public void ring()
    {
        System.out.println("Phone is ringing");
    }
    public void lift()
    {
        System.out.println("Phone is being lifted");
    }
    public void disconnect()
    {
        System.out.println("Call disconnected");
    }
    public void DefaultOne()
    {
        System.out.println("Default method called");
    }
}
public class Question4 {
    public static void main(String[] args) {
        Telephone tf = new SmartPhone();
        tf.ring();
        tf.lift();
        tf.disconnect();

    }
}
