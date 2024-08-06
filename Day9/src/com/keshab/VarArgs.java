package com.keshab;

public class VarArgs {
    static int sum(int ...arr){
        int sum = 0;
        for(int a:arr){
            sum+= a;
        }
        return sum;
    }
    public static void main(String[] args) {
        System.out.println("Welcome to Varargs tutorials");
        System.out.println("The sum of 4 and 5 is "+sum(4,5));
        System.out.println("The sum of 4,3 and 5 is "+sum(4,3,5));

    }
}
