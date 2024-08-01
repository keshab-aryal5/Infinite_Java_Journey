package keshab;

public class Question3 {
    public static void main(String[] args) {
        int[] marks = new int[]{
                1,2,3,4,5,6
        };
        int sum = 0;
        for(int i:marks){
            sum+=i;
        }
        System.out.println(sum/(float)marks.length);
    }
}
