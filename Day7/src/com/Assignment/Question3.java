package com.Assignment;
import java.util.Scanner;
public class Question3 {
    public static void SumNatural(int n){
        int sum = 0;
        for(int i=1;i<=n;i++){
            sum+= i;
        }
        System.out.println(sum);
    }
    public static void main(String[] args) {
        int n;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the natural number for which you want sum: ");
        n = in.nextInt();
        SumNatural(n);
    }
}
