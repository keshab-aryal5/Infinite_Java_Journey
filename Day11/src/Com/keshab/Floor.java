package Com.keshab;

public class Floor {
    static int SearchFloor(int[] arr,int target)
    {
        int low = 0;
        int high = arr.length-1;
        while(low<=high) {
            int mid = (int) ((low + high) / 2);
            if (arr[mid] == target)
                return target;
            else {
                if (arr[0] < arr[arr.length - 1]) {
                    if (arr[mid] > target)
                        high = mid - 1;
                    else
                        low = mid + 1;
                } else {
                    if (arr[mid] < target)
                        high = mid - 1;
                    else
                        low = mid + 1;
                }
            }
        }
        if(arr[0]>arr[arr.length-1])
            return arr[low];
        else
            return arr[high];

    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,5,45};
        int[] arr2 = {111,72,63,56,45};
        int target = 6;
        System.out.println(SearchFloor(arr,target));
//        System.out.println(SearchFloor(arr2,target));
    }
}
