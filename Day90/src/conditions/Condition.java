package conditions;

import java.util.Scanner;

public class Condition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a, b, choice;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number1: ");
		a = sc.nextInt();

		System.out.println("Enter Number2: ");
		b = sc.nextInt();

		System.out.println("1-Add\n2-Substract\n3-Multiply\n4-Divide");
		choice = sc.nextInt();

		if (choice == 1) {
			System.out.println(a + " + " + b + " = " + (a + b));
		} else if (choice == 2) {
			System.out.println(a + " - " + b + " = " + (a - b));
		} else if (choice == 3) {
			System.out.println(a + " * " + b + " = " + (a * b));
		} else if (choice == 4) {
			System.out.println(a+" / "+b+" = "+ (a/b));
		} else {
			System.out.println("Invalid option selected.");
		}
	}

}
