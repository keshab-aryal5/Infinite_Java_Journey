package com.FileHandaling;

import java.io.*;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        File file = new File("Revision.txt");
        try
        {
            if(file.createNewFile())
            {
                System.out.println("File created  successfully");
            }
            else
            {
                System.out.println("File named "+file.getName()+" already exist");
            }
        }
        catch(IOException e)
        {
            System.out.println("File couldn't be created.");
        }
        try
        {
            FileWriter fw = new FileWriter(file);
            fw.write("Hello there , this is a revision series of java. Happy coding.");
            fw.close();
        }
        catch(IOException e)
        {
            System.out.println("Couldn't write into the file.");
        }
    }
}
