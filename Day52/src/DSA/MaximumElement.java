package DSA;

public class MaximumElement {
    public static void main(String[] args) {
        int[]arr = new int[]{4,5,6,333,-767,1,2};
        System.out.println(FindMaximum(arr));
    }
    static int FindMaximum(int[]arr)
    {
        int low = 0;
        int high = arr.length-1;
        int max = Integer.MIN_VALUE;
        while(low<=high)
        {
            int mid  = low+(high-low)/2;
            if(arr[mid]>=arr[low])
            {
                if(arr[mid]>max)max = arr[mid];
                low = mid+1;
            }
            else
            {
                if(arr[high]>max)max = arr[high];
                high = mid-1;
            }
        }
        return max;
    }
}
