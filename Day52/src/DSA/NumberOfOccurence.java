package DSA;

public class NumberOfOccurence {
    public static void main(String[] args) {
        int[] arr = new int[]{2,4,6,8,8,11,13};
        int target = 13;
        int start,end;
        start = FindIndex(arr,target,true);
        if(start!=-1)
        {
            end = FindIndex(arr,target,false);
            System.out.println("The number "+target+" occurs "+(end-start+1)+" times in the array");
        }
        else
            System.out.println("The number "+target+" occurs 0 times in the array");

    }
    static int FindIndex(int[]arr,int target,boolean IsStart)
    {
        int low = 0;
        int high = arr.length-1;
        int index = -1;
        while(low<=high)
        {
            int mid = low+(high-low)/2;
            if(arr[mid]==target)
            {
                index = mid;
                if(IsStart)
                    high = mid-1;
                else
                    low = mid+1;
            }
            else if(arr[mid]>target)
                high = mid-1;
            else
                low = mid+1;
        }
        return index;
    }
}
