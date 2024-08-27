package com.Assignment;

import java.sql.SQLOutput;

class GoodMorning extends Thread
{
    public void run()
    {
        while(true)
        {
            System.out.println("Good Morning");
        }
    }
}
class Welcome extends Thread
{
    public void run()
    {
        while(true)
        {
            System.out.println("Welcome");
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
public class Question1 {
    public static void main(String[] args) {
        GoodMorning gm = new GoodMorning();
        Welcome wel = new Welcome();

        gm.setPriority(Thread.MIN_PRIORITY);
        System.out.println(gm.getPriority());
        System.out.println(gm.getState());
        gm.start();
        wel.start();
    }
}
