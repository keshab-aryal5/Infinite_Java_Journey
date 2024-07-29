package com.Assignment;
import java.util.Scanner;
public class Question3 {
    public static void main(String[] args) {
        String name;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter your name: ");
        name = in.nextLine();
        System.out.println("Hello "+name+", have a nice day");
    }
}
