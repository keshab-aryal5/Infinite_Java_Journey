package exceptionhandaling;

import java.util.Scanner;
public class FinallyRunner {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int[] numbers = { 12, 3, 4, 5 };
		try {
			int number = numbers[5];
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Invalid index provided.");
		}
		finally {
			System.out.println("Closing scanner");
			scanner.close();
		}
	}
}
