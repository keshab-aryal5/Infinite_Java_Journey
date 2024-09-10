package com.DSA;

public class Main {
    public static int PeakIndex(int[]arr)
    {
        int high = arr.length-1;
        int low = 0;
        while(low<high)
        {
            int mid = low+(high-low)/2;
            if(arr[mid]>arr[mid+1])
            {
                high = mid;
            }
            else
            {
                low = mid+1;
            }
        }
        return low;
    }
    public static int BinarySearch(int[]arr,int low, int high,int target)
    {
        boolean isAscending = arr[low]<arr[high];
        while(low<=high)
        {
            int mid = low+(high-low)/2;
            if(arr[mid]==target)
                return mid;
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
        return -1;
    }
    public static void main(String[] args) {
//        int[] arr = new int[]{1,2,3,4,5,3,1};
        int[] arr = new int[]{0,1,2,3,4,2,1};
        int target = 10;
        int peakIndex = PeakIndex(arr);
        int lowIndex = BinarySearch(arr,0,peakIndex,target);
        if(lowIndex==-1)
            System.out.println(BinarySearch(arr,peakIndex,arr.length-1,target));
        else
            System.out.println(lowIndex);
    }
}
