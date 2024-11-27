package functionalProgramming;

import java.util.List;

public class EvenOdd {

	public static void main(String[] args) {
		List<Integer> list = List.of(1, 4, 7, 9);
		filterEven(list);
		filterOdd(list);
	}

	private static void filterOdd(List<Integer> list) {
		// TODO Auto-generated method stub
		list.stream().filter(x -> x % 2 == 1).forEach(x -> System.out.println(x));

	}

	private static void filterEven(List<Integer> list) {
		// TODO Auto-generated method stub
		list.stream().filter(x -> x % 2 == 0).forEach(x -> System.out.println(x));

	}

}
