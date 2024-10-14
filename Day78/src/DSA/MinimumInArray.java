package DSA;

public class MinimumInArray {
    public static void main(String[] args) {
        int[]arr = {1, 4, 3, -5, -4, 8, 6};
        int min = findMin(arr,arr.length);
        System.out.println(min);
        int max = findMax(arr,arr.length);
        System.out.println(max);
    }
    public static int findMin(int[]arr,int n)
    {
        if(n==1)
            return arr[0];
        else
            return Math.min(arr[n-1],findMin(arr,n-1));
    }
    public static int findMax(int[]arr,int n)
    {
        if(n==1)
            return arr[0];
        else
            return Math.max(arr[n-1],findMin(arr,n-1));
    }
}
