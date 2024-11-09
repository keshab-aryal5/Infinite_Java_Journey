package functionalProgramming;

import java.util.List;

public class FunctionalProgrammingRunner {

	public static void main(String[] args) {
		//		List<String> list = List.of("Apple", "Banana", "Cat", "Dog");
		//		printWithFP(list);
		List<Integer> list = List.of(1, 4, 7, 90);
		List<String> list2 = List.of("Cat", "Batting", "Hat", "Rating", "Mat");
		list.stream().filter(element -> element % 2 != 0).forEach(element -> System.out.println(element));
		list2.stream().filter(element -> element.endsWith("at")).forEach(element -> System.out.println(element));
		int sum = list.stream().reduce(0, (number1, number2) -> number1 + number2);
		System.out.println(sum);
		int sum2 = list.stream().filter(element -> element % 2 != 0).reduce(0, (number1, number2) -> number1 + number2);
		System.out.println(sum2);

	}

	private static void printBasic(List<String> list) {
		for (String str : list) {
			System.out.println(str);
		}
	}
	private static void printWithFP(List<String> list) {
		list.stream().forEach(element -> System.out.println(element));
	}

}
