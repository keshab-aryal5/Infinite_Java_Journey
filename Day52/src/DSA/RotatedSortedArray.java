package DSA;

public class RotatedSortedArray {
    public static void main(String[] args) {
        int[]arr = new int[]{7,8,9,1,2,3,4,5,6};
        int target = 87;
        int index = searchInRotatedSortedArray(arr,target);
        System.out.println("The element "+target+" is found at index "+index);
    }
    static int searchInRotatedSortedArray(int[]arr, int target)
    {
        int low = 0;
        int high = arr.length-1;
        while(low<=high)
        {
            int mid = low+(high-low)/2;
            if(arr[mid]==target)
                return mid;
            else
            {
                if(arr[low]<=arr[mid])
                {
                    int index = BinarySearch(arr,low,mid,target);
                    if(index!=-1)
                        return index;
                    else
                        low = mid+1;
                }
                else
                {
                    int index = BinarySearch(arr,mid,high,target);
                    if(index!=-1)
                        return index;
                    else
                        high = mid-1;
                }
            }
        }
        return -1;
    }
    static int BinarySearch(int[]arr, int low, int high, int target)
    {
        if(arr[low]<=target && target<=arr[high])
        {
            while(low<=high)
            {
                int mid = low+(high-low)/2;
                if(arr[mid]==target)
                    return mid;
                else if(arr[mid]>target)
                    high = mid-1;
                else
                    low = mid + 1;
            }
            return -1;
        }
        else
            return -1;
    }
}
