package assignment;
import java.util.Scanner;
public class Chpa5Qsn2 {
    public static void main(String[] args) {
        int i=2,n,sum=0;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number upto which you want the sum: ");
        n = in.nextInt();
        while(i<=n){
            sum+=i;
            i+=2;
        }
        System.out.println(sum);
    }
}
