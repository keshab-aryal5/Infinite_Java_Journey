package DSA;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
       int[] arr = new int[] {19,18,27,1,25,36};
       SelectionSort(arr);
       System.out.println(Arrays.toString(arr));
    }
    public static void SelectionSort(int[] arr)
    {
        int max,maxIndex,i,j;
       for( i=0 ;i<arr.length;i++)
       {
           max = arr[0];
           maxIndex = 0;
           for( j=1;j<arr.length-i;j++)
           {
               if(arr[j]>max)
               {
                   max = arr[j];
                   maxIndex = j;
               }
           }
           swapElement(arr,maxIndex,--j);
       }
    }
    public static void swapElement(int[]arr, int maxIndex, int lastIndex)
    {
        int temp = arr[maxIndex];
        arr[maxIndex] = arr[lastIndex];
        arr[lastIndex] = temp;
    }
}
