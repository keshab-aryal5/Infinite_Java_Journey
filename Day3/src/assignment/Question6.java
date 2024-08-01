package assignment;
import java.util.Scanner;
public class Question6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the address of your website: ");
        String website = in.next();
        if(website.endsWith(".com")){
            System.out.print("It's commercial website");
        }
        else if(website.endsWith(".org")){
            System.out.println("It's an organization website");
        }
        else if(website.endsWith(".in")){
            System.out.println("It's an indian website");
        }
        else{
            System.out.println("This webiste name is not found in our data");
        }
    }
}
