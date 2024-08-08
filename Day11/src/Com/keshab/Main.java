package Com.keshab;

public class Main {
    public static void main(String[] args) {
        int[] arr = {2,4,6,9,11,12,14,20,36,48};
        int target = 30;
        int low = 0;
        int high = arr.length-1,middle;
        do
        {
            middle = (int)((low+high)/2);
//            System.out.println("Middle = "+middle);
            if(arr[middle]==target)
            {
                break;
            }
            else if(arr[middle]<target)
            {
                low = middle+1;
//                System.out.println("low= "+low);
            }
            else
            {
                high = middle-1;
//                System.out.println("High= "+high);
            }
            if(low>=high)
                middle = -1;
        }while(low<high);
        if(middle == -1)
            System.out.println("Element not in array");
        else
            System.out.println(middle);
    }
}
