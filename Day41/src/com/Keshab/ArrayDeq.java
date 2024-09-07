package com.Keshab;
import java.util.ArrayDeque;
public class ArrayDeq {
    public static void main(String[] args) {
        ArrayDeque<Integer> ad1 = new ArrayDeque<>();
        ad1.add(6);
        ad1.add(65);
        System.out.println(ad1.getFirst());
        System.out.println(ad1.getLast());

    }
}
