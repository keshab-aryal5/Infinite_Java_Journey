package com.DSA;

public class OrderAgnosticCeiling {
    public static int FindCeiling(int[] arr, int target)
    {
        int low = 0;
        int high = arr.length-1;
        boolean isAscending = arr[low]<arr[high]?true:false;
        while(low<=high)
        {
            int mid = low +(high-low)/2;
            if(arr[mid]==target)
                return arr[mid];
            else if (arr[mid]>target)
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
            if(low<arr.length)
                return arr[low];
            else
                return -1;
        }
        else
        {
            if(high>-1)
                return arr[high];
            else
                return -1;
        }
    }
    public static void main(String[] args) {
        int arr[] = {2,3,5,9,14,16,18};
        int arr2[] = {18,16,14,9,5,3,2};
        int target = 4 ;

        System.out.println(FindCeiling(arr,target));
        System.out.println(FindCeiling(arr2,target));
    }
}
