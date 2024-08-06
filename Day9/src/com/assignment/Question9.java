package com.assignment;

public class Question9 {
    static float Converter(float c)
    {
        float f = c *(9/5.0f)+32;
        return f;
    }
    public static void main(String[] args) {
        System.out.println(Converter(-40));
    }
}
