package com.keshab.ThreadRevision;
class MyThread1 extends Thread
{
    @Override
    public void run()
    {
        while(true)
        {
            System.out.println("My thread is runnning");
            System.out.println("I am happy");
        }

    }
}
class MyThread2 extends Thread
{
    public void run()
    {
        while(true)
        {
            System.out.println("Thread2 is running");
            System.out.println("I am sad!");
        }
    }
}
public class First {
    public static void main(String[] args) {
        MyThread1 t1 = new MyThread1();
        MyThread2 t2 = new MyThread2();
        t1.start();
        t2.start();
    }
}
