package mapExercise;

import java.util.HashMap;
import java.util.Map;

public class ExerciseRunner {

	public static void main(String[] args) {
		String statement = "This is a great thing . This thing has never happened before";
		Map<Character, Integer> occurence = new HashMap<>();

		char[] chars = statement.toCharArray();
		for (char chr : chars) {
			Integer integer = occurence.get(chr);
			if (integer == null) {
				occurence.put(chr, 1);
			} else {
				occurence.put(chr, integer + 1);
			}
		}
		System.out.println(occurence);

		Map<String, Integer> occ = new HashMap<>();
		String[] arr = statement.split(" ");
		for (String str : arr) {
			Integer in = occ.get(str);
			if (in == null) {
				occ.put(str, 1);
			} else {
				occ.put(str, in + 1);
			}
		}
		System.out.println(occ);
	}

}
