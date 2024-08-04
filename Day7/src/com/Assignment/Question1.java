package com.Assignment;
import java.util.Scanner;
public class Question1 {
    public static void main(String[] args) {
        int n;
        System.out.print("Enter the number whose multiplication table  you want: ");
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        for(int i = 1;i<=10;i++){
            System.out.println(n+"X"+i+" = "+n*i);
        }
    }
}
