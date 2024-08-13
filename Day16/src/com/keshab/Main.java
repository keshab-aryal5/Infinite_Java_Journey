package com.keshab;

class Base{
    int x;
    protected int mno;
    void printMe()
    {
        System.out.println("I am a method");
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }
}
class Derived extends Base
{
    int y;
    public int getY()
    {
        return this.y;
    }
    public void setY()
    {
        this.y = y;
    }
}
public class Main {
    protected int mno = 25;
    public static void main(String[] args) {
//        System.out.println("Hello there");
        Derived dv = new Derived();
        dv.setX(20);
        System.out.println(dv.getX());
    }
}
