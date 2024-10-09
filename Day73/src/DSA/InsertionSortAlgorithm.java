package DSA;
import java.util.Arrays;
public class InsertionSortAlgorithm {
    public static void main(String[] args) {
        int[] arr = new int[] {5,4,3,2,1,0};
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void sort(int[] arr)
    {
        int i,j;
        for(i = 0;i<arr.length-1;i++)
        {
            j = i+1;
            while(j>0)
            {
                if(arr[j]<arr[j-1])
                    swap(arr,j);
                else
                    break;
                j--;
            }
        }
    }
    public static void swap(int[]arr,int i)
    {
        int temp = arr[i];
        arr[i] = arr[i-1];
        arr[i-1] = temp;
    }
}
