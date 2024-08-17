package com.keshab;
abstract class MyClass
{
    public abstract void Greet();
    public abstract void Diamond();
}
abstract class HerClass extends MyClass
{
    public void Greet()
    {
        System.out.println("Hello world");
    }
}
class HisClass extends HerClass
{
    public void Hira()
    {
        System.out.println("Hiralal shrestha is the topper of 6th sem");
    }
    public void Diamond()
    {
        System.out.println("Hello Diamond here");
    }
}
public class Abstraction {
    public static void main(String[] args) {
        HisClass his = new HisClass();
        his.Diamond();
        his.Hira();
        his.Greet();
    }
}
