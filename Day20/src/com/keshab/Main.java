package com.keshab;
interface Bicycle
{
    int a = 45;
    void applyBrake(int decrement);
    void speedUp(int increment);
}
interface Car
{
    void applyBrake(int speed);
}
class Bhosadi implements Bicycle,Car
{
    public void applyBrake(int decrement)
    {
        System.out.println("The brake have been applied sucessfully");
    }
    public void speedUp(int increment)
    {
        System.out.println("The speed is increased successfully");
    }
}
class AvonCycle implements Bicycle
{
    int speed = 7;
    public void applyBrake(int decrement)
    {
        speed -= decrement;
        System.out.println("Brake applied");
    }
    public void speedUp(int increment)
    {
        speed += increment;
        System.out.println("Spped increased");
    }
}
public class Main {
    public static void main(String[] args) {
        AvonCycle cycleHarry = new AvonCycle();
        cycleHarry.applyBrake(20);
    }
}
