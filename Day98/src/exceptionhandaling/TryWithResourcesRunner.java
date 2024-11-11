package exceptionhandaling;

import java.util.Scanner;
public class TryWithResourcesRunner {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int[] numbers = { 12, 3, 4, 5 };
		int number = numbers[21];
		scanner.close();
	}

}
