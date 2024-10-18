package DSA;

public class ThreeTimesRepetation {
    public static void main(String[] args) {
        int[] arr = {5, 5, 5, 9, 3, 3, 3, 7, 7, 7};
        System.out.println("The unique number is: "+findUnique(arr));
    }
    static int findUnique(int[]arr)
    {
        int[] bitcount = new int[32];
        for(int num : arr)
        {
            for(int i=0;i<32;i++)
            {
                if((num & (1<<i))!=0)
                    bitcount[i]++;
            }
        }

        //Reconstruction....

        int result  = 0;
        for(int i = 0;i < 32;i++)
        {
            if(bitcount[i]%3 != 0)
                result |= (1<<i);
        }
        return result;
    }
}
