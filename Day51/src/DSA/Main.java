package DSA;
import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        int[][] arr = new int[][]
                {
                        {1,2,3,4,5},
                        {6,7,8,9,10},
                        {11,12,13,14,15}
                };
        int target = 8;
        System.out.println("Target "+target+" is found at "+Arrays.toString(SearchInTwoD(arr,target)));
    }
    public static int[] SearchInTwoD(int[][]arr,int target)
    {
        int row = 0;
        int col = arr[0].length-1;

        while(row<arr.length && col>-1)
        {
            if(arr[row][col] == target)
                return new int[]{row,col};

            else if(arr[row][col]<target)
                row++;
            else
                col--;
        }
        return new int[]{-1,-1};
    }
}