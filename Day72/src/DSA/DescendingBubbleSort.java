package DSA;

import java.util.Arrays;

public class DescendingBubbleSort {
    public static void main(String[] args) {
        int[] arr = new int[] {1,2,3,4,5,6,7,8};
        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void bubbleSort(int[]arr)
    {
        int i, j;
        boolean notswapped = true;
        for(i=0;i<arr.length;i++)
        {
            notswapped = true;
            for(j=0;j<arr.length-1-i;j++)
            {
                if(arr[j]<arr[j+1])
                {
                    swapElements(arr,j);
                    notswapped = false;
                }
            }
            if(notswapped)
                break;
        }
    }
    public static void swapElements(int[]arr, int j)
    {
        int temp = arr[j];
        arr[j] = arr[j+1];
        arr[j+1] = temp;
    }
}
