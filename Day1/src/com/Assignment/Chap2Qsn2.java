package com.Assignment;
import java.util.Scanner;
public class Chap2Qsn2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        char grade;
        int decrypted;
        System.out.print("Enter  your grade: ");
        grade = in.next().toUpperCase().charAt(0);
//        System.out.println(grade);
        decrypted = grade+8;
        System.out.println("After encryption grade: "+(char)decrypted);
        System.out.println("After decryption grade: "+(char)(decrypted-8));
    }
}
