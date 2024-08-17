package com.assignment;
class Monkey
{
    public void jump()
    {
        System.out.println("Monkey Jumped");
    }
    public void bite()
    {
        System.out.println("Monkey bite");
    }
}
interface BasicAnimal
{
    void eat();
    void sleep();
}
class Human extends Monkey implements BasicAnimal
{
    public void eat()
    {
        System.out.println("Human beings eat also");
    }
    public void sleep()
    {
        System.out.println("Human being sleep too");
    }
}
public class Question3 {
    public static void main(String[] args) {
        System.out.println("Hello World");
    }
}
