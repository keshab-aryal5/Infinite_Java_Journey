package com.Assignment;
import java.util.Scanner;
public class Question2 {
    public static void main(String[] args) {
        int a,b,c;
        float cgpa;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter your marks in first subject: ");
        a = in.nextInt();
        System.out.println("Enter your marks in second subject: ");
        b = in.nextInt();
        System.out.println("Enter your marks in third subject: ");
        c = in.nextInt();

        cgpa = (a+b+c)/30.0f;
        System.out.println(cgpa);
    }
}
