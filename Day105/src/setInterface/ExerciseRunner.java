package setInterface;

import java.util.HashMap;
import java.util.Map;

public class ExerciseRunner {

	public static void main(String[] args) {
		String str = "This is an awesome occasion. This has never happened before";
		Map<Character, Integer> occurence = new HashMap<>();
		char[] chr = str.toCharArray();
		for (char ch : chr) {
			Integer index = occurence.get(ch);
			if (index == null) {
				occurence.put(ch, 1);
			} else {
				occurence.put(ch, index + 1);
			}

		}
		//		System.out.println(occurence);

		String[] stringArray = str.split(" ");
		Map<String, Integer> wordOcc = new HashMap<>();
		for (String stri : stringArray) {
			Integer index = wordOcc.get(stri);
			if (index == null) {
				wordOcc.put(stri, 1);
			} else {
				wordOcc.put(stri, index + 1);
			}
		}
		System.out.println(wordOcc);
	}

}
