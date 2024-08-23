package com.keshab;

public class PackageCWH {
    public static void main(String[] args) {
        int i = 10;
        int j = 0;
        try
        {
            j = 18/i;
            System.out.println("Did I execute? ");
        }
        catch(Exception e)
        {
            System.out.println("Something went wrong");
        }
        System.out.println(j);
        System.out.println("Bye");
    }
}
