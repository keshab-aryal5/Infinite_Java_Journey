package logicBuilder;

import java.util.ArrayList;

class Day22 {
	private int number;

	public Day22(int n) {
		this.number = n;
	}

	public boolean isPrime(int n) {
		if (n <= 1) {
			return false;
		} else if (n <= 3) {
			return true;
		} else if (n % 2 == 0 || n % 3 == 0) {
			return false;
		} else {
			for (int i = 5; i * i <= n; i = i + 6) {
				if (n % i == 0 || n % (i + 2) == 0) {
					return false;
				}
			}
			return true;
		}
	}

	public void printPrimeSum() {
		int sum = 0;
		System.out.print("The sum of prime number less than " + number + " is: ");
		for (int i = 2; i < number; i++) {
			if (isPrime(i)) {
				sum += i;
			}
		}
		System.out.println(sum);
	}
}

class Day24 {
	private int[] array;

	public Day24(int[] arr) {
		this.array = arr;
	}

	public ArrayList<Integer> findSum() {
		ArrayList<Integer> arr = new ArrayList<>();
		int sum = 0;
		for (int i = 1; i < array.length; i++) {
			if (array[i] == 0) {
				arr.add(sum);
				sum = 0;
			} else {
				sum += array[i];
			}
		}
		return arr;
	}
}

class Day25 {
	private int[] array;

	public Day25(int[] arr) {
		this.array = arr;
	}

	public boolean hasConsequetiveOdd() {
		int count = 0;
		for (int i = 0; i < array.length; i++) {
			if (array[i] % 2 == 1) {
				count++;
				if (count == 3) {
					return true;
				}
			} else {
				count = 0;
			}
		}
		return false;
	}
}
public class Logics {

}
