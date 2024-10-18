package DSA;

public class FindingDuplicates {
    public static void main(String[] args) {
        int[] arr = new int[] {2,3,4,1,2,1,3,6,4,6,9};
        int ans = arr[0];
        for(int i=1;i<arr.length;i++)
        {
            ans ^= arr[i];
        }
        System.out.println(ans);
    }
}
