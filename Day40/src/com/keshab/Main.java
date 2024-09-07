package com.keshab;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> l1 = new ArrayList<Integer>();
        ArrayList<Integer> l2 = new ArrayList<Integer>(5);

        l2.add(10);
        l2.add(18);
        l2.add(19);
        l2.add(21);


        l1.add(5);
        l1.add(6);
        l1.add(7);
        l1.add(8);
        l1.add(9);
        l1.add(0,10);
        l1.clear();
        l1.addAll(0,l2);
        System.out.println(l2.size());
        System.out.println(l1.contains(7));
        System.out.println(l1.indexOf(7));
//        for(int i = 0;i<l1.size();i++)
//        {
//            System.out.println(l1.get(i));
//        }
    }
}
