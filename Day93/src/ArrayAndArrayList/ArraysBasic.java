package ArrayAndArrayList;

import java.util.Arrays;
public class ArraysBasic {

	public static void main(String[] args) {
		int[] marks = new int[5];
		Arrays.fill(marks, 100);
		int[] array1 = { 1, 2, 3 };
		int[] array2 = { 1, 2, 3 };
		int[] array3 = { 3, 2, 1 };

		System.out.println(Arrays.equals(array3, array2));

	}

}
