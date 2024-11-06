package patternRevision;

import java.util.Scanner;
public class Pattern2 {

	public static void main(String[] args) {
		//		input:5
		//		output:
		//		         1
		//		       2 1
		//		     3 2 1
		//		   4 3 2 1
		//		 5 4 3 2 1
		Scanner sc = new Scanner(System.in);
		int row, i, j, k;
		System.out.print("Enter the number of rows: ");
		row = sc.nextInt();
		for (i = 1; i <= row; i++) {
			for (k = row; k > i; k--) {
				System.out.print("  ");
			}
			for (j = i; j >= 1; j--) {
				System.out.print(" " + j);
			}
			System.out.println();
		}
	}
}
