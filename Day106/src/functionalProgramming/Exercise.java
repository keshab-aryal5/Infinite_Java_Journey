package functionalProgramming;

import java.util.Comparator;
import java.util.List;
import java.util.stream.IntStream;

class Comparing implements Comparator<Integer> {

	@Override
	public int compare(Integer o1, Integer o2) {
		// TODO Auto-generated method stub
		return Integer.compare(o1, o2);
	}

}

public class Exercise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IntStream.range(1, 11).map(x -> x * x).forEach(x -> System.out.println(x));

		List<String> abWords = List.of("Apple", "Ant", "Bat");
		abWords.stream().map(x -> x.toLowerCase()).forEach(x -> System.out.println(x));

		List<String> cdWords = List.of("Apple","Ant","Bat");
		cdWords.stream().map(x -> x.length()).forEach(x -> System.out.println(x));

		System.out.println(IntStream.range(1, 11).reduce(0, (n1, n2) -> n1 + n2));

		List<Integer> abs = List.of(23, 12, 34, 53);
		System.out.println(abs.stream().max(new Comparing()).get());

		List<Integer> number = List.of(23, 12, 34, 53);
		System.out.println(number.stream().filter(x -> x % 2 == 1).toList());
		System.out.println(number.stream().filter(x -> x % 2 == 0).toList());

		System.out.println(IntStream.range(1, 11));
	}

}
