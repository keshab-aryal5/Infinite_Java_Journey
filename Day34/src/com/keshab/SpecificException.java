package com.keshab;

import java.util.Scanner;

public class SpecificException {
    public static void main(String[] args) {
        int[] marks = new int[3];
        marks[0] = 56;
        marks[1] = 7;
        marks[2] = 3;

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the array index: ");
        int ind = sc.nextInt();
        System.out.print("Enter the number to divide the value with: ");
        int number = sc.nextInt();
        try
        {
            System.out.println("The value at array index entered is: "+marks[ind]);
            System.out.println("The value of array value divided by number is: "+marks[ind]/number);
        }
        catch(ArithmeticException e)
        {
            System.out.println("Arithmentic exception occurred");
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println("The provided index is out of bound in array");
        }
    }
}
