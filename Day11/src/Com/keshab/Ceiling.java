package Com.keshab;

import java.util.Arrays;

public class Ceiling {

    public static int SearchCeiling(int arr[],int target)
    {
        int low = 0;
        int high = arr.length - 1;
        while (low <= high) {
            int mid = (int) ((high + low) / 2);
            if (arr[mid] == target)
                return target;
            else {
                if (arr[0] < arr[arr.length - 1]) {
                    if (arr[mid] > target)
                        high = mid - 1;
                    else
                        low = mid + 1;
                } else {
                    if (arr[mid] < target)
                        high = mid - 1;
                    else
                        low = mid + 1;
                }
            }
        }
        if(arr[0]<arr[arr.length-1])
            return arr[low];
        else
            return arr[high];
    }
    public static void main(String[] args) {
        int[] myarr = {2,3,5,9,14,16,18};
        int[] myarr2 ={18,16,14,9,5,3,2};
        int target = 8;
        System.out.println(SearchCeiling(myarr2,target));
//        System.out.println(SearchCeiling(myarr2,target));
    }
}
