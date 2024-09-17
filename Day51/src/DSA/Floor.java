package DSA;

public class Floor {
    public static void main(String[] args) {
        int[] arr = new int[]{1,3,9,18,21,25};
        int target = -55;
        System.out.println(FindFloor(arr,target));

        int[] arr2 = new int[]{25,21,19,9,3,1};
        System.out.println(FindFloor(arr2,target));
    }
    static int FindFloor(int[]arr, int target)
    {
        int low = 0;
        int high = arr.length-1;
        boolean isAscending = arr[0]<arr[high];
        while(low<=high)
        {
            int mid = low + (high-low)/2;
            if(arr[mid]==target)
                return arr[mid];
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
            if(low == arr.length)
                return -1;
            else
                return arr[low];
        }
    }
}
