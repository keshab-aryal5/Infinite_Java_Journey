package keshab;

public class Question4 {
    public static void main(String[] args) {
        int[][] arr1 ={
                {1,2,3},
                {4,5,6}
        };
        int[][] arr2 = {
                {1,2,3},
                {4,5,6}
        };
        int[][] result = new int[2][3];
        for(int i=0;i<2;i++){
            for(int j=0;j<3;j++){
                result[i][j]=arr1[i][j]+arr2[i][j];
            }
        }
        for(int[] arr: result){
            for(int x: arr){
                System.out.print(x+" ");
            }
            System.out.println();
        }
    }
}
