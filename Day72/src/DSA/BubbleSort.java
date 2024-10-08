package DSA;

import java.util.Arrays;

public class BubbleSort {
    static void swapElements(int i, int j, int[] arr)
    {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    static void bubbleSort(int[]arr)
    {
        int length = arr.length;
        boolean swap = false;
        int count = 0;
        for(int i = 0;i<length-1;i++)
        {
            swap = false;
            for(int j = 0; j<length-i-1; j++)
            {
                if(arr[j]>arr[j+1])
                {
                    swapElements(j,j+1,arr);
                    swap = true;
                }
            }
            if(!swap)
                break;
        }
    }
    public static void main(String[] args) {
        int[] arr = new int[] {21,12,9,8,1};
        Arrays.sort(arr);
        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
