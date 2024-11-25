package setInterface;

import java.util.Set;
import java.util.TreeSet;

public class RevisionSet {
	public static void main(String[] args) {
		TreeSet<Integer> numbers = new TreeSet<>(Set.of(65, 54, 34, 12, 99));
		System.out.println(numbers);
		System.out.println(numbers.floor(34));
		System.out.println(numbers.lower(34));
		System.out.println(numbers.ceiling(34));
		System.out.println(numbers.higher(34));

		System.out.println(numbers.subSet(34, 65));
		System.out.println(numbers.headSet(50));
	}
}
