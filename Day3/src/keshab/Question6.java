package keshab;

public class Question6 {
    public static void main(String[] args) {
        int[] arr = new int[]{
                1,2,3,4,5
        };
        int max = arr[0];
        for(int x:arr){
            if(x>max){
                max=x;
            }
        }
        System.out.println(max);

    }
}
