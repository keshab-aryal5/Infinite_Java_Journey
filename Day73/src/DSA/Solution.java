package DSA;

class Solution {
    public int missingNumber(int[] nums) {
        int i;
        sortArray(nums);
        for(i=0;i<nums.length;i++)
        {
            if(nums[i]!=i)
                return i;
        }
        return nums.length;
    }
    public void sortArray(int[]arr)
    {
        int i;
        for(i=0;i<arr.length;i++)
        {
            if(arr[i]==i)
                continue;
            else
            {
                do
                {
                    if(arr[i]==arr.length)
                        break;
                    else
                        swap(arr,i,arr[i]);
                }while(arr[i]!=i);
            }
        }
    }
    public void swap(int[]arr, int i, int j)
    {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
        return;
    }
}