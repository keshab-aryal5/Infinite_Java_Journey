package com.assignment;

public class Question2 {
    static void Pattern(int row)
    {
        for(int i=1;i<=row;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Pattern(5);
    }
}
