package com.keshab;

class MyThr extends Thread
{
    public MyThr()
    {

    }
    public MyThr(String name)
    {
        super(name);
    }
    public void run()
    {
        System.out.println("Hi hello xodo hare krishna bolo");
//        while(true)
//        {
//            System.out.println("I am a thread");
//        }
    }
}
public class Demo {
    public static void main(String[] args) {
//        MyThr t1 = new MyThr("Keshab");
//        MyThr t2 = new MyThr("Monster");
//        t1.start();
//        t2.start();
//        MyThr
//        t1.start();
//        System.out.println("The id of the thread t1 is: "+t1.threadId());
//        t1.start();
//        MyThr t1 = new MyThr("Keshab");
//        System.out.println("The name of the thread t1 is "+t1.getName());
//        System.out.println("The name of the thread t2 is "+t2.getName());
//        System.out.println("The id of the thread t2 is "+t2.threadId());

    HarryThread hrt = new HarryThread();
    Thread mythr = new Thread(hrt,"Keshab");
    mythr.start();
        System.out.println("The name is: "+mythr.getName());
    }
}
class HarryThread implements Runnable
{
    public void run()
    {
        System.out.println("Hello");
    }
}