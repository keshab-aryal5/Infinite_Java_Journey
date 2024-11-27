package functionalProgramming;

import java.util.List;

public class ListSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list = List.of(1, 2, 5, 3, 4, 5, 3, 2, 4, 5);
		findSum(list);
		findOddSum(list);
		findEvenSum(list);
		findSum(list);
		findDistict(list);
		findDistinctSorted(list);
		findSqauareOfDistinct(list);
	}

	private static void findSqauareOfDistinct(List<Integer> list) {
		// TODO Auto-generated method stub
		list.stream().distinct().map(e -> e * e).forEach(x -> System.out.println(x));

	}

	private static void findDistinctSorted(List<Integer> list) {
		list.stream().distinct().sorted().forEach(x -> System.out.print(x));
		System.out.println();
	}

	private static void findDistict(List<Integer> list) {
		list.stream().distinct().forEach(x -> System.out.print(x));
		System.out.println();

	}

	private static void findEvenSum(List<Integer> list) {
		int sum = list.stream().filter(x -> x % 2 == 0).reduce(0, (a, b) -> a + b);
		System.out.println("Even sum " + sum);
	}

	private static void findOddSum(List<Integer> list) {
		// TODO Auto-generated method stub
		int sum = list.stream().filter(x -> x % 2 == 1).reduce(0, (a, b) -> a + b);
		System.out.println("Odd sum " + sum);
	}

	private static void findSum(List<Integer> list) {
		// TODO Auto-generated method stub
		int sum = list.stream().reduce(0, (a, b) -> a + b);
		System.out.println(sum);
	}

}
