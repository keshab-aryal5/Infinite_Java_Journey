package com.keshab;
import java.util.Arrays;
class Student{
    int rollno;
    String name;
    int marks;
}
public class Main {
    public static void main(String[] args) {
        int[] arr = {5,6,7};
        System.out.println(Arrays.toString(arr));

        int[] arr2 = new int[4];
        System.out.println(arr2[0]);

        int[][] arr3 = new int[4][4];

        for(int[] x:arr3){
            for(int i=0;i<4;i++){
                x[i]=(int)(Math.random()*10);
            }
        }
        for(int[]x:arr3){
            for(int i=0;i<4;i++)
                System.out.print(x[i]+" ");
            System.out.println();
        }
        int[] arr32;
        arr32 = new int[5];

        Student s1 = new Student();
        s1.name = "keshab Aryal";
        s1.rollno = 24;
        s1.marks = 50;


        Student s2 = new Student();
        s2.name = "Ashok Aryal";
        s2.rollno = 53;
        s2.marks = 53;

        Student s3 = new Student;
        s3.name = "Amrit Aryal";
        s3.rollno = 34;
        s3.marks = 23;


        Student [] std = new Student[3];
        std[0] = s1;
        std[1] = s2;
        std[2] = s3;
    }
}
