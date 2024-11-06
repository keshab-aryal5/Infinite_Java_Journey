package patternRevision;

import java.util.Scanner;
public class Pattern1 {

	public static void main(String[] args) {

		//		input:5
		//		output:
		//			1 2 3 4 5
		//			2 3 4 5 1
		//			3 4 5 1 2
		//			4 5 1 2 3
		//			5 1 2 3 4

		int row, i, j;
		System.out.print("Enter the number of rows: ");
		Scanner sc = new Scanner(System.in);
		row = sc.nextInt();
		for (i = 1; i <= row; i++) {
			for (j = i; j < i + row; j++) {
				if (j <= row) {
					System.out.print(j + " ");
				} else {
					System.out.print((j - row) + " ");
				}
			}
			System.out.println();
		}
	}

}
