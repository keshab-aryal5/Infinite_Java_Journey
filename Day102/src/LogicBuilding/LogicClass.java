package LogicBuilding;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

class Day11 {
	private String str;
	private char c;

	public Day11(String st, char c) {
		this.str = st;
		this.c = c;
	}

	public int findFrequency() {
		str = str.toLowerCase();
		c = Character.toLowerCase(c);
		int count = 0;
		int start = 0;
		int end = str.length() - 1;
		while (str.indexOf(c, start, end) != -1) {
			start = str.indexOf(c, start, end) + 1;
			count++;

		}
		return count;
	}
}

class Day12 {
	public void printOutput() {
		int n = 123;
		int sum = 0;
		int last;
		while (n > 0) {
			last = n % 10;
			sum += last;
			n = n / 10;
		}
		System.out.println(sum);
	}
}

class Day13 {
	public void findOutput() {
		String text1 = "Learn-Coding";
		String text2 = "coding";
		if (text1.contains(text2)) {
			System.out.println("Exists");
		} else {
			System.out.println("Doesn't exists");
		}
	}
}
class Day14 {
	private int limit;

	public Day14(int n) {
		this.limit = n;
	}

	public void buildFiboSequence() {
		int a = 0;
		int b = 1;
		int count = 0, c = 1;
		while (count < limit) {
			System.out.print(a + " ");
			a = b;
			b = c;
			c = a + b;
			count++;
		}
		System.out.println();
	}
}

class Day15 {
	private int upper;

	public Day15(int limit) {
		this.upper = limit;
	}

	public void printPrime() {
		System.out.println("Prime numbers from 1 to " + upper);
		for (int i = 2; i <= upper; i++) {
			if (isPrime(i)) {
				System.out.print(i + " ");
			}
		}
		System.out.println();
	}

	private boolean isPrime(int i) {
		if (i <= 1) {
			return false;
		} else if (i <= 3) {
			return true;
		} else if (i % 2 == 0 || i % 3 == 0) {
			return false;
		} else {
			for (int j = 5; j * j <= i; j = j + 6) {
				if (i % j == 0 || i % (j + 2) == 0) {
					return false;
				}
			}
			return true;
		}
	}
}

class Day16 {
	private ArrayList<Integer> arr;

	public Day16(List<Integer> arr) {
		this.arr = new ArrayList<Integer>(arr);
	}

	public void findWrongPlacedNumber() {
		List<Integer> brr = arr.stream().sorted().toList();
		int count = 0;
		int length = arr.size();
		for (int i = 0; i < length; i++) {
			if (!arr.get(i).equals(brr.get(i))) {
				count++;
			}
		}
		System.out.println("Number of wrong placed element in list are " + count);
	}
}

class Day17 {
	private List<Integer> list;

	public Day17(List<Integer> list) {
		this.list = list;
	}

	public void findDuplicate() {
		ArrayList<Integer> arr = new ArrayList<>(list);
		Collections.sort(arr);
		for (int i = 0; i < arr.size() - 1; i++) {
			if (arr.get(i) == arr.get(i + 1)) {
				System.out.print(arr.get(i) + " ");
			}
		}
		System.out.println();
	}
}

class Day18 {
	private int[] arr;

	public Day18(int[] arr) {
		this.arr = arr;
	}

	public void reverseArray() {
		int temp;
		int last = arr.length - 1;
		for (int i = 0; i <= arr.length / 2; i++) {
			temp = arr[i];
			arr[i] = arr[last - i];
			arr[last - i] = temp;
		}
		System.out.println("Reverse array is: " + Arrays.toString(arr));
		return;
	}
}

class Day19 {
	private int[] arr;

	public Day19(int[] arr) {
		this.arr = arr;
	}

	public int findEvenReverseSum() {
		int length = arr.length;
		int sum = 0;
		boolean isEven = length % 2 == 0;
		for (int i = 0; i < arr.length; i++) {
			if (isEven) {
				if (i % 2 == 1) {
					sum += arr[i];
				}
			} else {
				if (i % 2 == 0) {
					sum += arr[i];
				}
			}
		}
		return sum;
	}
}

class Day20 {
	private List<Integer> arr;

	public Day20(List<Integer> lst) {
		this.arr = lst;
	}

	public int countOne() {
		int count = 0;
		int maxCount = 0;
		Iterator<Integer> iterator = arr.iterator();
		while (iterator.hasNext()) {
			if (iterator.next() == 1) {
				count++;
			} else {
				if (count > maxCount) {
					maxCount = count;
				}
				count = 0;
			}
		}
		return maxCount;
	}
}

class Day21 {
	private int year;

	public Day21(int y) {
		this.year = y;
	}

	public void isLeapYear() {
		boolean result = false;
		if (year % 4 == 0) {
			if (year % 100 == 0) {
				if (year % 400 == 0) {
					result = true;
				} else {
					result = false;
				}
			} else {
				result = true;
			}
		} else {
			result = false;
		}
		if (result) {
			System.out.println("Leap year");
		} else {
			System.out.println("Not a leap year");
		}
	}
}
public class LogicClass {

}
