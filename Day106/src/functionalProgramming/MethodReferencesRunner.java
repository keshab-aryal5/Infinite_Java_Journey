package functionalProgramming;

import java.util.List;

public class MethodReferencesRunner {

	public static boolean checkEven(int n) {
		return n % 2 == 0;
	}

	public static void main(String[] args) {
		List.of("Ant", "Bat", "Cat", "Dog", "Elephat").stream().map(x -> x.length())
		.forEach(x -> System.out.println(x));
		List.of("Ant", "Bat", "Cat", "Dog", "Elephat").stream().map(String::length).forEach(System.out::println);

		//		Integer max = List.of(23, 45, 67, 34).stream().filter(MethodReferencesRunner::checkEven)
		//				.forEach(System.out::println);
	}
}