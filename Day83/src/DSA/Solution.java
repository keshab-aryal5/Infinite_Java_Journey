package DSA;

import java.util.Arrays;

class Solution {
    public static void main(String[] args) {
        int[][] arr = {{1,1,0},{1,0,1},{0,0,0}};
        flipAndInvertImage(arr);
//        System.out.println(Arrays.toString(arr));
        int n =5;
        int [] brr = countBits(n);
        System.out.println(Arrays.toString(brr));
    }
    public static void flipAndInvertImage(int[][] image) {
        for(int[] arr: image)
            flipMe(arr);
    }
    static void flipMe(int[]arr)
    {
        int low = 0;
        int high = arr.length-1;
        int temp ;
        while(low<high)
        {
            temp = arr[low]^1;
            arr[low] = arr[high]^1;
            arr[high] = temp;
            low++;
            high--;
        }
    }
    public static int[] countBits(int n) {
        int[] arr = new int[n+1];
        int count = 0;
        int steps = 0;
        int bits;
        while(steps<=n)
        {
            bits = 0;
            count = steps;
            while(count>0)
            {
                if((count&1)==1)
                    bits++;
                count >>= 1;
            }
            arr[steps] = bits;
            steps++;
        }
        return arr;
    }


}