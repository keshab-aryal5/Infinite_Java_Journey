package keshab;

import java.util.Arrays;

public class Question2 {
    public static void main(String[] args) {
        int[] arr2 = new int[]{
                1,2,4,5,5
        };
        int target = 2;
        for(int x:arr2){
            if(x==target)
            {
                System.out.println("Found");
                break;
            }
        }
    }
}
