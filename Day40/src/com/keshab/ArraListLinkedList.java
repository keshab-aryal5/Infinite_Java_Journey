package com.keshab;

import java.util.*;

public class ArraListLinkedList {
    public static void main(String[] args) {
        LinkedList<Integer> l1 = new LinkedList<>();
        LinkedList<Integer> l2 = new LinkedList<>();

        l2.add(15);
        l2.add(18);
        l2.add(19);

        l1.addAll(l2);
        l1.add(5);
        l1.add(6);
        l1.add(7);
        l1.add(4);
        l1.add(6);
        l1.add(0,5);
        l1.add(0,1);
        l1.add(0,12);
        l1.addLast(10);
        System.out.println(l1.contains(27));
        System.out.println(l1.indexOf(6));
        System.out.println(l1.lastIndexOf(6));
        for(int i:l1)
        {
            System.out.println(i);
        }
    }
}
