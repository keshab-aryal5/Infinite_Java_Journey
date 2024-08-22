package com.keshab;

interface Computer
{
    public void code();
}

class Laptop implements Computer
{
    public void code()
    {
        System.out.println("Code compile and run");
    }
}
class Desktop implements Computer
{
    public void code()
    {
        System.out.println("Code, compile, run: Faster");
    }
}
class Developer
{
    public void devApp(Computer alp)
    {
        alp.code();
    }
}
public class Main {
    public static void main(String[] args) {
        Computer lap = new Laptop();
        Computer desk = new Desktop();
        Developer navin = new Developer();
        navin.devApp(lap);
        navin.devApp(desk);
    }
}
