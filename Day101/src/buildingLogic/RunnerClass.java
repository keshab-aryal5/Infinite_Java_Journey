package buildingLogic;

import java.util.ArrayList;
import java.util.List;

class Day1 {
	private List<Integer> arr;

	public Day1(List<Integer> arr) {
		this.arr = arr;
	}

	public int FindMax() {
		return arr.stream().max((n1, n2) -> Integer.compare(n1, n2)).get();
	}
}

class Day2 {
	private List<Integer> nums1;
	private List<Integer> nums2;

	public Day2(List<Integer> nums1, List<Integer> nums2) {
		this.nums1 = new ArrayList<Integer>(nums1);
		this.nums2 = new ArrayList<Integer>(nums2);
	}

	public List<Integer> findInteraction() {
		List<Integer> interaction = new ArrayList<>();
		for (int x : nums1) {
			int get = nums2.indexOf(x);
			if (get != -1) {
				interaction.add(x);
				nums2.remove(Integer.valueOf(x));
			}
		}
		return interaction;
	}
}

class Day3 {
	private List<Integer> arr;

	public Day3(List<Integer> list) {
		this.arr = list;
	}

	public List<Integer> findUnique() {
		List<Integer> unique = new ArrayList<>();
		for (int x : arr) {
			int index = unique.indexOf(Integer.valueOf(x));
			if (index == -1) {
				unique.add(x);
			}
		}
		return unique;
	}
}

class Day4 {
	private String s;

	public Day4(String s) {
		this.s = s;
	}

	public String convertToString() {
		return "";
	}
}

class Day5 {

}

class Day6 {
	private String content;

	public Day6(String str) {
		this.content = str;
	}

	public void generateOutput() {
		String[] arr = content.split(" ");
		//		Arrays.reverse(arr);
		for (int i = arr.length - 1; i >= 0; i--) {
			StringBuilder str = new StringBuilder(arr[i]);
			System.out.println(arr[i].length() + " " + str.reverse().toString());
		}
	}
}

class Day7 {
	private int number;

	public Day7(int i) {
		this.number = i;
	}

	public int reverseNumber() {
		int sum = 0;
		int r = 0;
		while (number > 0) {
			r = number % 10;
			sum = sum * 10 + r;
			number /= 10;
		}
		return sum;
	}
}

class Day8 {
	private String str;

	public Day8(String str) {
		this.str = str;
	}

	public boolean checkPallindrome() {
		int length = str.length() - 1;
		str = str.toUpperCase();
		for (int i = 0; i < length / 2; i++) {
			if (str.charAt(i) != str.charAt(length - i)) {
				return false;
			}
		}
		return true;
	}
}

class Day9 {
	private int number;

	public Day9(int i) {
		this.number = i;
	}

	public Long findFactorial() {
		Long fact = 1L;
		for (int i = 1; i <= number; i++) {
			fact *= i;
		}
		return fact;
	}
}

class Day10 {
	private int number;

	public Day10(int num) {
		this.number = num;
	}

	public boolean checkForPerfect() {
		int sum = 0;
		for (int i = 1; i <= number / 2; i++) {
			if (number % i == 0) {
				sum += i;
			}
		}
		return sum == number;
	}
}
public class RunnerClass {

	public static void main(String[] args) {
		Day1 day1 = new Day1(List.of(3, 5, 7, 9, 3, 2));
		System.out.println(day1.FindMax());

		Day2 day2 = new Day2(List.of(1, 2, 69, 99, 2, 5), List.of(2, 2, 99, 69));
		System.out.println(day2.findInteraction());

		Day3 day3 = new Day3(new ArrayList<Integer>(List.of(1, 8, 1, 2, 3, 2, 4, 5, 4, 5)));
		System.out.println(day3.findUnique());

		Day4 day4 = new Day4("11101011110");
		System.out.println(day4.convertToString());

		Day6 day6 = new Day6("I AM STRONG");
		day6.generateOutput();

		Day7 day7 = new Day7(1225);
		System.out.println(day7.reverseNumber());

		Day8 day8 = new Day8("MALAYALAM");
		System.out.println(day8.checkPallindrome());

		Day9 day9 = new Day9(5);
		System.out.println(day9.findFactorial());

		Day10 day10 = new Day10(28);
		System.out.println(day10.checkForPerfect());

	}

}
