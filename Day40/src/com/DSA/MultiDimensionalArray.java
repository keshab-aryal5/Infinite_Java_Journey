package com.DSA;
import java.util.Arrays;
import java.util.Scanner;
public class MultiDimensionalArray {
    public static void swap(int[] arr, int start,int end)
    {
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
    }
    public static void main(String[] args) {
//          int[][] arr = new int[3][];
//          for(int i = 0;i<3;i++)
//          {
//              for(int j = 0;j<4;i)
//          }
//        Scanner sc = new Scanner(System.in);
//        int[][] arr = new int[3][2];
//        for(int i = 0;i<arr.length;i++)
//        {
//            for(int j = 0;j<arr[i].length;j++)
//            {
//                arr[i][j] = sc.nextInt();
//            }
//        }
//       for(int[] ar :arr)
//       {
//           System.out.println(Arrays.toString(ar));
//       }

        int[] arr = new int[]{1,2,3,4};
//        swap(arr,0,arr.length-1);
//        System.out.println(Arrays.toString(arr));
        int low = 0;
        int high = arr.length-1;
        while(low<high)
        {
            swap(arr,low,high);
            low++;
            high--;
        }
        System.out.println(Arrays.toString(arr));
    }
}
