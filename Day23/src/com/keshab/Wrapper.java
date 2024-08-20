package com.keshab;

public class Wrapper {
    public static void main(String[] args) {
        int num = 7;
        Integer num1 = 8;

        int num2 = num1;
        System.out.println(num2);
//        System.out.println(num1);

        String str = "12";
        int num3 = Integer.parseInt(str);
        System.out.println(num3*3);
    }
}
