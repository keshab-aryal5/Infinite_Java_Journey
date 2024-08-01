package keshab;

public class Question1 {
    public static void main(String[] args) {
        float[] arr = new float[]{
                1.2f,2.3f,4.5f,5.6f,6.5f
        };
        float sum = 0;
        for(float f: arr){
            sum+=f;
        }
        System.out.println(sum);
    }
}
