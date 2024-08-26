package com.keshab;
class MyThr3 extends Thread
{

    public void run()
    {
        int i = 0;
        while(i<50)
        {
            System.out.println("Thank you: "+i);
//            Thread.sleep(455);
            i++;
        }
    }
}
class MyThr4 extends Thread
{

    public void run()
    {
        int i = 0;
        while(true)
        {
            System.out.println("Thank you: "+i);
        }
    }
}
public class ThreaMethods {
    public static void main(String[] args) {
        MyThr3 t3 = new MyThr3();

        MyThr3 t31 = new MyThr3();
        t3.start();
        try
        {
            t3.join();
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
        t31.start();

    }
}
