package com.keshab;

import java.util.Scanner;

public class QuickQuiz {
    public static void main(String[] args) {
        int[] arr = new int[]{
                1,2,3,4,5
        };
        boolean status = true;
        do
        {
            try
            {
                Scanner sc = new Scanner(System.in);
                System.out.print("Enter the index you want to access: ");
                int ind = sc.nextInt();
                System.out.println("The element at index "+ind+" is: "+arr[ind]);
            }
            catch(ArrayIndexOutOfBoundsException e)
            {
                status = false;
                System.out.println("The provided index is out of bound");
            }
        }while(status);

    }
}
