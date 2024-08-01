package assignment;
import java.util.Scanner;
public class Question5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int year;
        System.out.println("Enter your year: ");
        year = in.nextInt();

        if(year % 4 ==0){
            if(year%100 ==0){
                if(year%400==0)
                {
                    System.out.println("It's a leap year");
                }
                else{
                    System.out.println("It's not a leap year");
                }
            }
            else{
                System.out.println("It's a leap year");
            }
        }
        else{
            System.out.println("It's not a leap year");
        }
    }
}
