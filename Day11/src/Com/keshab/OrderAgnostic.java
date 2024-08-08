package Com.keshab;

public class OrderAgnostic {
    public static int Search(int arr[],int target)
    {
        int low = 0;
        int high = arr.length-1;
        while(low<high)
        {
            int mid = (int)((high+low/2));
            if(arr[mid]==target)
                return mid;
            else
            {
                if(arr[0]<arr[arr.length-1])
                {
                    if(arr[mid]>target)
                        high = mid-1;
                    else
                        low = mid+1;
                }
                else
                {
                    if(arr[mid]<target)
                        high = mid-1;
                    else
                        low = mid+1;
                }
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};
        int[] arr2 = {5,4,3,2,1};
        int target = 2;
        System.out.println(Search(arr,target));
        System.out.println(Search(arr2,target));
    }
}
