package com.Assignment;
import java.util.Scanner;
public class Chap2Qsn3 {
    public static void main(String[] args) {
        int given_number = 20,user_number;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter your number: ");
        user_number = in.nextInt();
        if(user_number > given_number){
            System.out.println("Given number is less than user number");
        }
        else{
            System.out.println("Given number is greater than your number");
        }
    }
}
