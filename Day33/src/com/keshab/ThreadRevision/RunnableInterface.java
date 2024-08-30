package com.keshab.ThreadRevision;
class MyThreadRunnable1 implements Runnable
{
    public void run()
    {
        while(true)
        {
            System.out.println("Hello there how are you? Hope you're doing well");
        }
    }
}
class MyThreadRunnable2 implements Runnable
{
    public void run()
    {
        while(true)
        {
            System.out.println("I am inside the MyThreadRunnable2");
        }
    }
}
public class RunnableInterface {
    public static void main(String[] args) {
        MyThreadRunnable1 t1 = new MyThreadRunnable1();
        MyThreadRunnable2 t2 = new MyThreadRunnable2();

        Thread obj1 = new Thread(t1);
        Thread obj2 = new Thread(t2);

        obj1.start();
        obj2.start();
    }
}
