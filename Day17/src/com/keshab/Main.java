package com.keshab;

public class Main {
    static void SearchTarget(int[][] arr,int target)
    {
        int row = 0;
        int column = arr[0].length-1;

        while(row<arr.length &&  column>=0)
        {
            if(arr[row][column] == target)
            {
                System.out.println("Target found at row "+row+" and column "+column);
                return;
            }
            else if(arr[row][column]<target) row++;
            else  column--;
        }
        System.out.println("Target not found in array");
        return;
    }
    public static void main(String[] args) {
        int[][] arr = new int[][]
        {
                {10,13,23,35},
                {11,14,24,37},
                {19,21,27,38},
                {22,26,29,40}
        };
        int target = 22;
        SearchTarget(arr,target);
    }
}
