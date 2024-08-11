package Com.Keshab;
//import java.util.integer;
public class Main {
    public static void main(String[] args) {
        int arr[] ={0,1,2,3};
        System.out.println(FindIndex(arr));
    }
    static int FindIndex(int[] arr)
    {
        int low=0;
        int high = arr.length-1;
        int min = Integer.MAX_VALUE;
        int index = -1;
        while(low<=high)
        {
            int mid = low + (high-low)/2;
            if(arr[low]<=arr[mid])
            {
                if(min>arr[low])
                {
                    min = arr[low];
                    index = low;
                }
                low = mid+1;
            }
            else
            {
                if(min>arr[mid])
                {
                    min = arr[mid];
                    index = mid;
                }
                high = mid -1;
            }
        }
        return index;
    }
}
