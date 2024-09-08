package com.DSA;

public class Main {
    public static int BinarySearch(int[]arr, int target)
    {
        if(arr.length ==0)
            return -1;
        int low = 0;
        int high = arr.length-1;
        while(low<=high)
        {
            int mid = low +(high-low)/2;
            if(arr[mid]==target)
                return mid;
            else if(arr[mid]<target)
                low = mid+1;
            else
                high = mid-1;
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[] = {2,4,6,11,12,14,20,36,48};
        int target = 11;
        int index = BinarySearch(arr,target);
        if(index == -1)
            System.out.println("The element "+target+" is not in the array");
        else
            System.out.println("The element "+target+" is found at index "+index+" in the array");
    }
}