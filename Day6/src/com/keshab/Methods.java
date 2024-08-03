package com.keshab;
class Computer
{
    public void playMusic()
    {
        System.out.println("Mysic Playing");
    }
    public String getMeAPen(int cost)
    {
        return "Pen";
    }
    public int Add(int n1, int n2)
    {
        return n1+n2;
    }

    public double Add(int n1,double n2)
    {
        return n1+n2;
    }
}
public class Methods
{
    public static void main(String[] args)
    {
        Computer comp = new Computer();
        comp.playMusic();
        comp.getMeAPen(10);

        System.out.println(comp.Add(5,10));
        System.out.println(comp.Add(5,9.5));
    }
}
