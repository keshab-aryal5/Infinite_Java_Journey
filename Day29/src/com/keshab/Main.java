package com.keshab;
class MyThr1 extends Thread
{
    public MyThr1(String name)
    {
//        super.setPriority(10);
        super(name);
    }
    public void run()
    {
        while(true)
        {

            System.out.println("Thank you"+this.getName());
        }

    }
}
public class Main {
    public static void main(String[] args) {
        MyThr1 t1 = new MyThr1("Thread t1");
        MyThr1 t2 = new MyThr1("Thread t2");
        MyThr1 t3 = new MyThr1("Thread t3");
        MyThr1 t4 = new MyThr1("Thread t4");
        MyThr1 t5 = new MyThr1("Thread t5");
        MyThr1 t6 = new MyThr1("Thread t6");
        t6.setPriority(Thread.MAX_PRIORITY);
        t1.setPriority(Thread.MIN_PRIORITY);
        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
        t6.start();
    }
}
