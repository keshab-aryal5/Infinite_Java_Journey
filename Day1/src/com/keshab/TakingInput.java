package com.keshab;
import java.util.Scanner;
public class TakingInput {
    public static void main(String[] args) {
        int math,science,sum,english, nepali,computer;
        float percentage;
        System.out.println("Ready  to race");
        Scanner in = new Scanner(System.in);
        System.out.print("Enter your marks in Mathematics: ");
        math = in.nextInt();
        System.out.print("Enter your marks in Science: ");
        science = in.nextInt();
        System.out.print("Enter your marks in Nepali: ");
        nepali = in.nextInt();
        System.out.print("Enter your marks in English: ");
        english = in.nextInt();
        System.out.print("Enter your marks in Computer: ");
        computer = in.nextInt();
        sum = math+science+english+nepali+computer;
        percentage = (sum/500.0f)*100;
        System.out.println(percentage);
//        boolean b = in.hasNextInt();
//        System.out.println(b);
//        System.out.println(in.nextInt());
//        System.out.println("hi");
////        int myAge = in.nextInt();
//        boolean result = myAge
//        System.out.println(myAge);
//        System.out.println("HI");
    }
}
