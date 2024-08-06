package com.keshab;

public class Main {
    static void change(int a){
        a=98;
    }
    static void change(int[] a){
        a[0] = 75;
    }
    static void farak(int a){
        System.out.println("Farak vayo ni ta");
    }
    public static void main(String[] args) {
        int[] marks = {52,73,77,89,94};
        int x = 45;
        change(x);
//        System.out.println("The value of x "+x);
        System.out.println("The value marks[0] is: "+marks[0]);
        change(marks);
        System.out.println("The value of marks[0] is: "+marks[0]);

    }
}
