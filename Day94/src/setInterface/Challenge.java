package setInterface;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
public class Challenge {

	public static void main(String[] args) {
		List<Character> characters = List.of('A', 'Z', 'A', 'B', 'Z', 'F', 'Q', 'R', 'S');
		Set<Character> char1 = new LinkedHashSet<>(characters);
		Set<Character> char2 = new TreeSet<>(characters);

		Iterator it1 = char1.iterator();
		while (it1.hasNext()) {
			System.out.println(it1.next());
		}
		System.out.println(char1);
		System.out.println(char2);
	}

}
