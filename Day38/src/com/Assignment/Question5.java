package com.Assignment;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Question5 {
    public static void main(String[] args) {
       File myFile = new File("./Tables/Multiplication_table_of_5.txt");
       try
       {
           if(myFile.createNewFile())
           {
               System.out.println("File created sucessfully");
           }
           else
           {
               System.out.println("File already exist");
           }
           try
           {
               FileWriter fw = new FileWriter(myFile);
               for(int i =1;i<=10;i++)
               {
                   fw.append("5 X "+i+" = "+(5*i)+"\n");
               }
               fw.close();
           }
           catch(IOException e)
           {
               System.out.println("Couldn't write into the file");
           }

       } catch (IOException e) {
           System.out.println("Couldn't create a file");
//           throw new RuntimeException(e);
       }
    }
}
