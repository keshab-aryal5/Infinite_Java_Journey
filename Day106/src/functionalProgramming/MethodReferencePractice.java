package functionalProgramming;

import java.util.List;

public class MethodReferencePractice {

	public static void main(String[] args) {
		List.of(4, 9, 16).stream().map(Math::sqrt).forEach(System.out::println);

		List.of("Aryal", "keshab", "Arghakhanchi", "Nepal").stream().map(String::toUpperCase)
		.forEach(System.out::println);

		List.of("Aryal", "Keshab", "Zebra", "Arghakhanchi", "AAAA").stream().sorted().forEach(System.out::println);
	}
}