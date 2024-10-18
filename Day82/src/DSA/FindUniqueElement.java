package DSA;

public class FindUniqueElement {
    public static void main(String[] args) {
        int[]arr = new int[] {2,3,-5,4,-3,-2,5};
        int ans = findUnique(arr);
        System.out.println(ans);
    }
    static int findUnique(int[]arr)
    {
        int sum = arr[0];
        for(int i=1;i<arr.length;i++)
            sum += arr[i];
        return sum;
    }
}
