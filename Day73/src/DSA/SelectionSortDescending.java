package DSA;

import java.util.Arrays;

public class SelectionSortDescending {
    public static void main(String[] args) {
        int[] arr = new int[] {1,2,3,4,5,6};
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void sort(int[]arr)
    {
        int i,j,low,lowIndex;
        for(i=0;i<arr.length;i++)
        {
            low = arr[0];
            lowIndex = 0;
            for(j=1;j<arr.length-i;j++)
            {
                if(low>arr[j])
                {
                    low = arr[j];
                    lowIndex = j;
                }
            }
            swap(arr,lowIndex,--j);
        }
    }
    public static void swap(int[]arr,int low,int high)
    {
        int temp = arr[low];
        arr[low] = arr[high];
        arr[high] = temp;
    }
}
