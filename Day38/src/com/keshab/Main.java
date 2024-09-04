package com.keshab;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*
        File myFile = new File("Keshab.txt");
        try
        {
            myFile.createNewFile();
            System.out.println("File created Sucessfullly");
        }
        catch(IOException e)
        {
            System.out.println(e);
        }
        try {
            FileWriter fileWriter = new FileWriter("Keshab.txt");
            fileWriter.write("This is our first file from this java course\n b12F_msh");
            fileWriter.close();
        }
        catch (IOException e) {
//            throw new RuntimeException(e);
            System.out.println("Unable to write inside the file");
        }

        */
        //Reading a file
        File myFile = new File("Keshab.txt");

        try {
            Scanner sc = new Scanner(myFile);
            while(sc.hasNextLine())
            {
                String line = sc.nextLine();
                System.out.println(line);
            }
            sc.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }


    }
}
