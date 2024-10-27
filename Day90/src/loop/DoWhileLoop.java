package loop;

import java.util.Scanner;
public class DoWhileLoop {
	public static void main(String[] args) {
		int number = 0;
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("Cube is: " + number * number * number);
			System.out.println("Enter your number: ");
			number = sc.nextInt();
		} while (number > 0);
		System.out.println("Thank You! Have Fun!");
	}
}
