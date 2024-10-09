package DSA;
import java.util.Arrays;
public class OneToNCyclicSort {
    public static void main(String[] args) {
        int[] arr = new int[] {4,3,6,5,2,1};
        CyclicSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void CyclicSort(int[]arr)
    {
        int i = 0;
        for(i = 0;i<arr.length;i++)
        {
            if(arr[i] == i+1)
                continue;
            else
            {
                do {
                    swap(arr,i,arr[i]-1);
                }while(arr[i]!=i+1);
            }
        }
    }
    public static void swap(int[]arr, int i,int j)
    {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;

    }
}
