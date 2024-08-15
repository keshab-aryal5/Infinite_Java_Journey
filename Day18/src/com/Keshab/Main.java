package com.Keshab;

public class Main {
    public static void main(String[] args) {
        int Arr[][]= {
                {1,2,3,4},
                {5,6,7,8},
                {9,10,11,12},
                {13,14,15,16}
        };
        int target =11;
        SearchTarget(Arr,target);

    }
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
}
