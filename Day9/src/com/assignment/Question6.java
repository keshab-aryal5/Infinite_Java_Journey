package com.assignment;

public class Question6 {
    public static float Average(int ...num)
    {
        int length = num.length;
        int sum = 0;
        float avg;
        for(int n:num)
            sum+= n;
        avg = sum/(float)length;
        return avg;
    }
    public static void main(String[] args) {
        System.out.println(Average(10,20,30,40));
    }
}
