package com.keshab;

import java.util.Arrays;

enum Keshab
{
    Coding, TimePass,Driving,InCollege
}
public class Main {
    public static void main(String[] args) {
//        Keshab[] kes = Keshab.values();
//        System.out.println(Arrays.toString(kes));
//        for(Keshab k: kes)
//            System.out.println(k+" "+k.ordinal());
        Keshab kes = Keshab.Driving;
        switch(kes)
        {
            case Coding -> System.out.println("Okey My boy is coding");
            case TimePass -> System.out.println("Bullshit you are just wasting your  time boy");
            case Driving -> System.out.println("Great learn driving as soon as you can");
            case InCollege -> System.out.println("Yeah buddy learn with focus");
            default -> System.out.println("Do something bro");
        }
    }
}
