package setInterface;

import java.util.List;
import java.util.TreeSet;

public class SetRevision {
	public static void main(String[] args) {
		//		Set<String> set = Set.of("Apple", "Banana", "Cat");
		//
		//		Set<String> hashSet = new HashSet<>(set);
		//		System.out.println(hashSet.add("Apple"));
		//
		//		ArrayList<Integer> unique = new ArrayList<>(
		//				new LinkedHashSet<>(new ArrayList<>(List.of(2, 5, 5, 3, 5, 2, 6, 5))));
		//		System.out.println(unique);

		//		Set<Integer> numbers = new HashSet<>();
		//		Set<Integer> numbers = new TreeSet<>();
		//		System.out.println(numbers);
		//		numbers.add(343434);
		//		numbers.add(34343);
		//		numbers.add(3434);
		//		numbers.add(343);
		//		numbers.add(34);
		//		numbers.add(3);
		//		System.out.println(numbers);

		//		Set<Integer> num2 = new LinkedHashSet<>(numbers);
		//		System.out.println(num2);

		List<Character> characters = List.of('A', 'Z', 'A', 'B', 'Z', 'F');
		System.out.println(characters);
		TreeSet<Character> char1 = new TreeSet<>(characters);
		System.out.println(char1);
	}
}
