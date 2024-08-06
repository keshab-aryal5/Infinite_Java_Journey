package com.assignment;
import java.util.Scanner;
public class Question10 {
    public static void main(String[] args) {
        int n,sum=0,i;
        System.out.print("Enter the value of n: ");
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        for(i=1;i<=n;i++)
            sum+=i;
        System.out.println(sum);
    }
}
