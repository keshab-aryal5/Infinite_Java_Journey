package com.keshab.ThreadRevision;
class MyThr extends Thread
{
    public MyThr(String name)
    {
        super(name);
    }
    public void run()
    {
        while(true)
        {
            System.out.println("I am a thread");
        }
    }
}
public class ThreadConstructors {
    public static void main(String[] args) {
        MyThr t = new MyThr("Keshab");
        System.out.println(t.getName());
    }
}
