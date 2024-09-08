package com.DSA;

public class CeilingOfNumber {
    public static int Ceiling(int[] arr, int target)
    {
        int low = 0;
        int high = arr.length-1;
        while(low<=high)
        {
            int mid = low + (high-low)/2;
            if(arr[mid]==target)
                return arr[mid];
            else if(arr[mid]<target)
            {
                low = mid+1;
            }
            else
            {
                high = mid-1;
            }
        }
        if(low==arr.length)
            return -1;
        else
            return arr[low];
    }

    public static void main(String[] args) {
        int arr[] = {2,3,5,9,14,16,18};
        int target = 19;
        System.out.println(Ceiling(arr,target));
    }
}
