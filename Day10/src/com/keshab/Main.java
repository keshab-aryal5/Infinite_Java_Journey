package com.keshab;

public class Main {
    public static void main(String[] args) {
        //syntax
        //datatype[] rollno = new datatype[5];
//        int[] arr = {10,39,434};
//        arr = {10,20,30};
//        arr =  new int[5];
        int[] arr = new int[]{
                10,20,30,40,50
        };
        System.out.println(LinerSearch(arr,500));
    }
    //Search in the array and  return the index if item found else return -1;
    static int LinerSearch(int[] arr,int n)
    {
        if(arr.length==0) {
            return -1;
        }
        else
        {
            for(int i=0;i<arr.length;i++)
            {
                if(arr[i]==n)
                    return i;
            }
        }
        return -1;
    }
}