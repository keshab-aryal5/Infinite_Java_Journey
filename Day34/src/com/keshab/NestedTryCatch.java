package com.keshab;

import java.util.Scanner;

public class NestedTryCatch {
    public static void main(String[] args) {
        int[] marks = new int[3];
        marks[0] = 56;
        marks[1] = 7;
        marks[2] = 3;
        Scanner sc = new Scanner(System.in);
        int ind = sc.nextInt();

        try
        {
            System.out.println("Welcome to Day34");
            try
            {
                System.out.println(marks[ind]);
            }
            catch(IndexOutOfBoundsException e)
            {
                System.out.println("Sorry this index doesn't exist");
                System.out.println("Exception in level 2");
            }
        }
        catch(Exception e)
        {
            System.out.println("Exception in level 1");
        }
    }
}
