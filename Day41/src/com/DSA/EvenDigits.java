package com.DSA;

public class EvenDigits {
    public static int Count(int[]arr)
    {
        int count = 0;
        for(int n:arr)
        {
            if(hasEven(n))
                count++;
        }
        return count;
    }
    public static boolean hasEven(int num)
    {
        int count = 0;
        int r;
        while(num>0)
        {
            num /= 10;
            count++;
        }
        if(count%2==0)
            return true;
        else
            return false;
    }
    public static void main(String[] args)
    {
        int[] arr = {1,2,3,4,33,55,222,3333,444444,22,33,44,55};
        System.out.println(Count(arr));

    }
}
