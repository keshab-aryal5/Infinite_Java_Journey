package DSA;

public class RotatedSortedArraySecond {
    public static void main(String[] args) {
        int[] arr = new int[]{3,2,3,3,3};
        int target = 13;
        int low = 0, high = arr.length-1;
        while(low<=high)
        {
            int mid = low + (high-low)/2;
            if(arr[mid]==target)
            {
                System.out.println("Yes");
                break;
            }
            else if(arr[low]==target && arr[high]==target && arr[mid]==target)
            {
                low++;
                high--;
            }
            else if(arr[low]<=arr[mid])
            {
                if(arr[low]>=target && target<=arr[mid])
                    high = mid;
                else
                    low = mid+1;
            }
            else
            {
                if(arr[mid]>=target && target<=arr[high])
                    low = mid;
                else
                    high = mid-1;
            }
        }
        System.out.println("No");
    }
}
