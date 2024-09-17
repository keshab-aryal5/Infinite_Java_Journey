package DSA;

public class FirstAndLastOccurence {
    public static void main(String[] args) {
        int nums[] = new int[] {5,7,7,8,8,10};
        int target = 8;
        int start =-1;
        int end = -1;
        start = FindIndex(nums,target,true);
        end = FindIndex(nums,target,false);
        System.out.println("Start: "+start+" End: "+end);
    }

    static int FindIndex(int[]arr, int target, boolean isStart)
    {
            int ans = -1;
            int start = 0;
            int end = arr.length-1;
            while(start<=end)
            {
                int mid = start+(end-start)/2;
                if(arr[mid]==target)
                {
                    ans = mid;
                    if(isStart)
                    {
                        end = mid-1;
                    }
                    else
                    {
                        start = mid+1;
                    }
                }
                else if(arr[mid]>target)
                {
                    end = mid-1;
                }
                else
                {
                    start = mid+1;
                }
            }
            return ans;

    }
}

