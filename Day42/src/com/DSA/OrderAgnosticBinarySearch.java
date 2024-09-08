package com.DSA;

public class OrderAgnosticBinarySearch {
    public static int OrderAgnosticBSearch(int[]arr, int target)
    {
        if(arr.length == 0)
            return -1;
        int low = 0;
        int high = arr.length -1;
        boolean ascending = arr[low]<arr[high]?true:false;
        while(low<=high)
        {
            int mid = low + (high-low)/2;
            if(arr[mid]==target)
                return mid;
            if(arr[mid]<target)
            {
                if(ascending)
                    low = mid+1;
                else
                    high = mid-1;
            }
            else
            {
                if(ascending)
                    high = mid-1;
                else
                    low = mid+1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr1 = {1,2,3,4,5,6,7};
        int[] arr2 = {7,6,5,4,3,2,1};
        int[] arr3 ={};
        System.out.println(OrderAgnosticBSearch(arr1,3));
        System.out.println(OrderAgnosticBSearch(arr2,3));
        System.out.println(OrderAgnosticBSearch(arr3,3));
    }
}
