package com.FileHandaling;
import java.io.*;
public class FileInfo {
    public static void main(String[] args) {
        File f = new File("Revision.txt");
        if(f.exists())
        {
            System.out.println("File Name: "+f.getName());
            System.out.println("File location: "+f.getAbsolutePath());
            System.out.println("File writable: "+f.canWrite());
            System.out.println("File readable: "+f.canRead());
            System.out.println("File Size: "+f.length());
//            System.out.println("File removed: "+f.delete());
        }
        else
        {
            System.out.println("File doesn't exists.");
        }
    }
}
