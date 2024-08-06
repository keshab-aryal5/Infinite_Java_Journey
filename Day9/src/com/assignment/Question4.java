package com.assignment;

public class Question4 {
    static void ReversePattern(int row)
    {
        for(int i=1;i<=row;i++)
        {
            for(int j=row;j>=i;j--)
            {
                System.out.print("* ");
            }
            System.out.println();
        }

    }
    public static void main(String[] args) {
        ReversePattern(5);
    }
}
