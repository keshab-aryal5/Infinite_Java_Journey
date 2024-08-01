package assignment;
import java.util.Scanner;
public class Question2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int sub1,sub2,sub3;
        float per;
        System.out.print("Enter your marks in first subject: ");
        sub1 = in.nextInt();
        System.out.print("Enter your marks in second subject: ");
        sub2 = in.nextInt();
        System.out.print("Enter your marks in third subject: ");
        sub3 = in.nextInt();
        if(sub1<33 || sub2<33 || sub3<33)
            System.out.println("You are failed.");
        else{
            per = ((sub1+sub2+sub3)/300.0f)*100;
            if(per<40)
                System.out.println("You are failed");
            else
                System.out.println("Congratulations you're failed");
        }
    }
}
