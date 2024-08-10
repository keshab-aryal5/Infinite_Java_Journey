package Com.Keshab;

public class Solution {
            static boolean Search(int[] nums, int target) {
                int low=0;
                int high = nums.length-1;
                while(low<=high)
                {
                    int mid = low+(high-low)/2;
                    if(nums[mid]==target) return true;
                    else if(nums[low]<=nums[mid])
                    {
                        if(nums[low]<=target && target<nums[mid]) high = mid-1;
                        else low = mid+1;
                    }
                    else
                    {
                        if(nums[mid]<target && target<=nums[high]) low = mid+1;
                        else high = mid-1;
                    }
                }
                return false;

        }

    public static void main(String[] args) {
//        int[] arr = {4,5,6,7,0,1,2};
//        int[] arr = {5,6,7,0,1,2,4};
//        int[] arr = {6,7,0,1,2,4,5};
//        int[] arr = {5,6,7,0,1,2,3};
        int[] arr = {1,0,1,1,1};
        int target = 0;
        System.out.println(Search(arr,target));
    }
}
