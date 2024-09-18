package DSA;
//import java.util.Scanner;
public class RotationCount {
    public static void main(String[] args) {
        int[]arr = new int[]{5,6,7,8,9,1,2,3,4};
        System.out.println(FindRotation(arr));
    }
    static int FindRotation(int[]arr) {
        int low = 0;
        int high = arr.length - 1;
        int max = Integer.MIN_VALUE;
        int index = -1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] >= arr[low]) {
                if (arr[mid] > max) {
                    max = arr[mid];
                    index = mid;
                }
                low = mid + 1;
            } else {
                if (arr[high] > max) {
                    max = arr[high];
                    index = high;
                }
                high = mid - 1;
            }
        }
        return index+1;
    }
}
