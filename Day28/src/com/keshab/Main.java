package com.keshab;
class MyThread1 extends Thread
{
    @Override
    public void run()
    {
        while(true)
        {
            System.out.println("My Thread is Running");
            System.out.println("I am happy");
        }
    }
}
class MyThread2 extends Thread
{
    @Override
    public void run()
    {
        while(true)
        {
            System.out.println("Thread 2 is good");
            System.out.println("I am sad!");
        }
    }
}
public class Main {
    public static void main(String[] args) {
        MyThread1 t1 = new MyThread1();
        MyThread2 t2 = new MyThread2();
        t1.start();
        t2.start();

    }
}
