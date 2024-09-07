package com.DSA;

public class MaxIn2DArray {
    public static int FindMax(int[][]arr)
    {
        int max = Integer.MIN_VALUE;
        for(int[] an:arr)
        {
            for(int n:an)
            {
                if(n>max)
                    max=n;
            }
        }
        return max;
    }
    public static void main(String[] args) {
        int[][] arr = {
                {1,2,3,4},
                {5,6,7,8,9},
                {10,11,2,333}
        };
        System.out.println(FindMax(arr));
    }
}
