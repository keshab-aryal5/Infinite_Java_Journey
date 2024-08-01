package com.keshab;

import java.util.Arrays;

public class Main{
    public static void main(String[] args) {
        int[] arr = new int[]{
                1,2,3,4,5,6
        };
        System.out.println(Arrays.toString(arr));
        int i=0,j=arr.length-1;
        int temp;
        while(i<j){
            temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
//            System.out.println(i+" "+arr[i]);
//            System.out.println(j+" "+arr[j]);
        }
        
        System.out.println(Arrays.toString(arr));
    }
}