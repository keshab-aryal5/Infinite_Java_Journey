package com.keshab;
import java.util.Arrays;
public class MinArray {
    public static void main(String[] args) {
        int[][] myarr = {
                {1,254,5,34},
                {10,20,3},
                {-1,-2}
        };
        System.out.println(Arrays.toString(Find(myarr,3)));
    }
    static int[] Find(int[][] arr,int target)
    {
        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr[i].length;j++)
            {
                if(arr[i][j] == target)
                    return new int[]{i,j};
            }
        }
        return new int[]{-1,-1};
    }
}
