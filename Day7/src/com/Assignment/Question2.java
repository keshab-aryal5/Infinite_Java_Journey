package com.Assignment;
import java.util.Scanner;
public class Question2 {
    public static void Pattern(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int n;
        Scanner in = new Scanner(System.in);
        System.out.print("How many rows do you want? ");
        n = in.nextInt();
        Pattern(n);
    }
}
