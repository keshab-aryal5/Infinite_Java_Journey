package keshab;

public class Question7 {
    public static void main(String[] args) {
        int[] arr = new int[]{
                1,2,3,-1,65
        };
        int min = arr[0];
        for(int i:arr){
            if(i<min)
                min=i;
        }
        System.out.println(min);
    }
}
