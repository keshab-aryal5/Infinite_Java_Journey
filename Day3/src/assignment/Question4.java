package assignment;
import java.util.Scanner;
public class Question4 {
    public static void main(String[] args) {
        int day;
        System.out.print("Enter your day: ");
        Scanner in = new Scanner(System.in);
        day = in.nextInt();

        String weekday = switch(day){
            case 1 -> "Monday";
            case 2 -> "Tuesday";
            case 3 -> "Wednesday";
            case 4 -> "Thursday";
            case 5 -> "Friday";
            case 6 -> "Saturday";
            case 7 -> "Sunday";
            default -> "Noneday";
        };
        System.out.println("It's "+weekday);
    }
}
