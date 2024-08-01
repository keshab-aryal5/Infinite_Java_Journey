package assignment;
import java.util.Scanner;
public class Question3 {
    public static void main(String[] args) {
        int salary;
        double tax;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter your salary: ");
        salary = in.nextInt();
        if(salary<2_50_000){
            tax = 0.0f;
       }
        else if(salary>=2_50_000 && salary<5_00_000){
            salary-=250000;
            tax = (5/100.0)*salary;
        }
        else if(salary>=5_00_000 && salary < 10_00_000){
            salary-=250000;
            tax = (5/100.0)*(2_50_000);
            salary-= 2_50_000;
            tax+= (20/100.0)*salary;
        }
        else{
            salary-=250000;
            tax = (5/100.0)*(2_50_000);
            salary-= 2_50_000;
            tax+= (20/100.0)*(5_00_000);
            salary-= 5_00_000;
            tax+= (30/100.0)*(5_00_000);
        }
        System.out.println("Your total tax is "+tax);
    }
}
