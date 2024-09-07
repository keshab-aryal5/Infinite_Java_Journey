package com.DSA;
import java.util.Arrays;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
//        int[] ros;
//        ros = new int[5];
//        System.out.println(ros[1]);
//
//        String[] arr = new String[4];
//        System.out.println(arr[0]);
//        int arr[] = new int[5];
//        for(int i = 0;i<arr.length;i++)
//        {
//            arr[i] = sc.nextInt();
//        }
//        System.out.println(Arrays.toString(arr));
//        for(int i: arr)
//        {
//            System.out.print(i+" ");
//        }

        //Arrays of objects..
        Scanner sc = new Scanner(System.in);
        String[] str = new String[4];
        for(int i = 0;i<str.length;i++)
        {
            str[i] = sc.next();
        }
        System.out.println(Arrays.toString(str));
    }
}
