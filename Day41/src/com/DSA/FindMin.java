package com.DSA;

public class FindMin {
    public static int Minimum(int[] arr )
    {
        int min = Integer.MAX_VALUE;
        if(arr.length == 0)
            return min;
        for(int n:arr)
        {
            if(n<min)
                min = n;

        }
        return min;
    }
    public static void main(String[] args) {
        int arr[] = {10,20,30,-11,3,4};
        System.out.println(Minimum(arr));
    }
}
