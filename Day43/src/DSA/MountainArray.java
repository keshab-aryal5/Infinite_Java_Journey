package DSA;

public class MountainArray {
    public static int PeakIndex(int[]arr)
    {
        int high = arr.length-1;
        int low = 0;
        int ans=-1;
        while(low<=high)
        {
            int mid = low +(high-low)/2;
            if(arr[mid]>arr[mid+1])
            {
                ans = mid;
                high = mid-1;
            }
            else
            {
                ans = mid+1;
                low = mid+1;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
//        int[] arr = new int[] {5,10,15,20,19,18};
        int[] arr = new int[] {0,10,5,2};
        System.out.println(PeakIndex(arr));
    }
}
