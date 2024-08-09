package Com.keshab;

public class Main {
    public static void main(String[] args) {
        int[] arr = {3,5,7,9,10,90,100,130,140,60,170};
        int target = 10;
        System.out.println(Search(arr,target));
    }
    static int Search(int[] arr, int target)
    {
        int low=0;
        int high = 1;
        while(low<=high)
        {
            int mid = low+(high-low)/2;
            if(arr[mid]==target)
                return mid;
            else if(arr[mid]>target)
                high = mid-1;
            else
            {
                high = high+(high-low)*2;
                low = mid+1;
            }
        }
        return -1;
    }
}
