package com.DSA;

public class FindMax {
    public static int Max(int[] arr)
    {
        int max = Integer.MIN_VALUE;
        if(arr.length ==0)
            return 0;
        for(int n:arr)
        {
            if(n>max)
                max = n;
        }
        return max;
    }

    public static void main(String[] args) {
        int[] arr = {10,20,30,50};
        System.out.println(Max(arr));
    }
}
