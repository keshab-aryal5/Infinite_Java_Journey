package com.keshab;
@FunctionalInterface
interface AB
{
    int add(int i,int j);
//    void runner();
}

public class InfiniteJava {
    public static void main(String[] args) {
        AB ab = (i,j)-> i+j;
        System.out.println(ab.add(6,4));
    }
}
