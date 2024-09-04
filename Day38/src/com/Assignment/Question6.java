package com.Assignment;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Question6 {
    public static void main(String[] args) {
        for(int i = 2;i<=9;i++)
        {
            File myFile = new File("MultiplicationTable"+i+".txt");
            try
            {
                if(myFile.createNewFile())
                {
                    System.out.println("File created Sucessfully");
                }
                else
                {
                    System.out.println("File couldn't be created");
                }
                try
                {
                    FileWriter fw = new FileWriter(myFile);
                    for(int j=1;j<=10;j++)
                    {
                        fw.append(i+" X "+j+" = "+(i*j)+"\n");
                    }
                    fw.close();
                }
                catch(IOException e)
                {
                    System.out.println("Couldn't write into file");
                }
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
