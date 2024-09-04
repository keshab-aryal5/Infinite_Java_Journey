package com.keshab;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class w3school {
    public static void main(String[] args) {
//        try
//        {
//            File myobj = new File("filename.txt");
//            if(myobj.createNewFile())
//            {
//                System.out.println("File created: "+myobj.getName());
//            }
//            else
//            {
//                System.out.println("File already exists.");
//            }
//        }
//        catch(IOException e)
//        {
//            System.out.println("An error occurred.");
//            e.printStackTrace();
//        }
//        try
//        {
//            FileWriter fw = new FileWriter("filename.txt");
//            fw.write("Hello this is output for the w3school file. Bye bye");
//            fw.close();
//        }
//        catch(IOException e)
//        {
//            System.out.println("An error occurred.");
//            e.printStackTrace();
//        }
//        try
//        {
//            File myObj = new File("filename.txt");
//            Scanner myReader = new Scanner(myObj);
//            while(myReader.hasNextLine())
//            {
//                String data = myReader.nextLine();
//                System.out.println(data);
//            }
//            myReader.close();
//        }
//        catch(FileNotFoundException e)
//        {
//            System.out.println("An error occurred");
//            e.printStackTrace();
//        }
        File myObj = new File("filename.txt");
        if(myObj.exists())
        {
            System.out.println("File name: "+myObj.getName());
            System.out.println("Absolute path: "+myObj.getAbsolutePath());
            System.out.println("Writeable: "+myObj.canWrite());
            System.out.println("Readable: "+myObj.canRead());
            System.out.println("File size in bytes "+myObj.length());
        }
    }
}
