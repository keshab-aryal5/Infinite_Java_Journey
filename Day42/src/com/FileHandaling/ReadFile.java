package com.FileHandaling;
import java.io.*;
import java.util.Scanner;
public class ReadFile {
    public static void main(String[] args) {
        File file = new File("Revision.txt");

        try
        {
            Scanner sc = new Scanner(file);
//            FileReader fr = new FileReader(file);
            while(sc.hasNextLine())
            {
                System.out.println(sc.nextLine());
            }

        }
        catch(IOException e)
        {
            System.out.println(e);
        }
    }
}
