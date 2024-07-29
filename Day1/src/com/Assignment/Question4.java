package com.Assignment;
import java.util.Scanner;
public class Question4 {
    public static void main(String[] args) {
        int km;
        float miles;
        Scanner in = new Scanner(System.in);
        System.out.println("How many Kilometers? ");
        km = in.nextInt();
        miles = km*0.62123f;
        System.out.println(km+"km is equivalent to "+miles+"miles");
    }
}
