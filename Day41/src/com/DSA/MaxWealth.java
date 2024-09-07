package com.DSA;

public class MaxWealth {
    public static int Wealth(int[][]details)
    {
        if(details.length==0)
            return 0;
        int max = Integer.MIN_VALUE;
        int sum=0;
        for(int[] cust: details)
        {
            sum = 0;
            for(int money : cust)
            {
                sum += money;
            }
            if(sum>max)
                max = sum;
        }
        return max;
    }

    public static void main(String[] args) {
        int[][] wealth = {
                {1,2,3},
                {3,2,1},
                {10,20,30}
        };
        System.out.println(Wealth(wealth));
    }
}
