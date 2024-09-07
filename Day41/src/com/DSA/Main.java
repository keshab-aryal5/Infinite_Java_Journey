package com.DSA;

public class Main {
    public static int Search(int[]arr, int target)
    {
        if(arr.length==0)
            return -1;
        for(int i =0;i<arr.length;i++)
        {
            if(arr[i]==target)
                return i;
        }
        return -1;
    }
    public static int Search2(int[]arr, int target)
    {
        if(arr.length==0)
            return -1;
        for(int n:arr)
        {
            if(n==target)
                return n;
        }
        return -1;
    }
    public static boolean Search3(int[]arr,int target)
    {
        if(arr.length==0)
            return false;
        for(int n: arr)
        {
            if(n==target)
                return true;
        }
        return false;
    }
    public static void main(String[] args) {
//        System.out.println("Hello with Day41");
        int[] arr = {1,2,3,4,5};
        System.out.println(Search(arr,15));
        System.out.println(Search2(arr,2));
        System.out.println(Search3(arr,2));
    }
}
