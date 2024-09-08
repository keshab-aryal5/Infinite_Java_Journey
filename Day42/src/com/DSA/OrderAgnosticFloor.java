package com.DSA;

public class OrderAgnosticFloor {
    public static int FindFloor(int[]arr, int target)
    {
        int low = 0, high = arr.length-1;
        boolean isAscending = arr[low]<arr[high];
        while(low<=high)
        {
            int mid = low +(high-low)/2;
            if(arr[mid]==target)
                return target;
            else if(arr[mid]>target)
            {
                if(isAscending)
                    high = mid-1;
                else
                    low = mid+1;
            }
            else
            {
                if(isAscending)
                    low = mid+1;
                else
                    high = mid-1;
            }
        }
        if(isAscending)
        {
            if(high == -1)
                return -1;
            else
                return arr[high];
        }
        else
        {
            if(low==arr.length)
                return -1;
            else
                return arr[low];
        }
    }

    public static void main(String[] args) {
        int arr[] =new int[] {2,3,5,9,14,16,18};
        int arr2[] =new int[] {18,16,14,9,5,3,2};
        int target = 100 ;

        System.out.println(FindFloor(arr,target));
        System.out.println(FindFloor(arr2,target));
    }
}