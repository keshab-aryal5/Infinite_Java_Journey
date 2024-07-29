package com.Assignment;
import java.util.Scanner;

public class Question5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        boolean check = in.hasNextInt();
        if(check){
            System.out.println("Yes it's an integer");
        }
        else{
            System.out.println("Nope, it's not an integer");
        }
    }
}
