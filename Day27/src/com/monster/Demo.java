package com.monster;
import com.keshab.*;

class prabhat extends keshab
{
    public int GiveAge()
    {
        return this.myAge;
    }
}
public class Demo {
    public static void main(String[] args) {
        prabhat pv = new prabhat();

        System.out.println(pv.GiveAge());
    }
}
