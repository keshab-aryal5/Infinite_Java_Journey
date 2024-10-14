package DSA;
import java.util.Arrays;
import java.util.Arrays;

public class SumTriangleFromArray {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 3, 4, 5};
        sumTraingle(arr);
    }
    public static void sumTraingle(int[]arr)
    {
        if(arr.length == 1)
        {
            System.out.println(Arrays.toString(arr));
            return;
        }
        else
        {
            int[]newArr = new int[arr.length-1];
            for(int i=0;i<arr.length-1;i++)
            {
                newArr[i] = arr[i]+arr[i+1];
            }
            sumTraingle(newArr);
            System.out.println(Arrays.toString(arr));
        }
    }
}

