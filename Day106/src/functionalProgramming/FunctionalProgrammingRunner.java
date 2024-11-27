package functionalProgramming;

import java.util.List;

public class FunctionalProgrammingRunner {

	public static void main(String[] args) {
		List<String> list = List.of("Apple", "Banana", "Cat", "Dog");
		//		printBasic(list);
		printWithFP(list);
		List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6);
		//		printWithFP(numbers);
	}

	private static void printWithFP(List<String> list) {
		list.stream().filter(element -> element.endsWith("at")).forEach(x -> System.out.println(x));

	}

	private static void printBasic(List<String> list) {
		for (String st : list) {
			if (st.endsWith("at")) {
				System.out.println(st);
			}
		}
	}

}
