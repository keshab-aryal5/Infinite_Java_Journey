package mapExercise;

import java.util.Arrays;

public class MyClass {
	public static boolean areAnagrams(String str1, String str2) {

		if (str1.equals(null) || str2.equals(null)) {
			return false;
		} else if (str1.length() != str2.length()) {
			return false;
		} else {
			str1 = str1.toLowerCase();
			str2 = str2.toLowerCase();
			char[] ch1 = str1.toCharArray();
			char[] ch2 = str2.toCharArray();
			Arrays.sort(ch1);
			Arrays.sort(ch2);

			if (Arrays.equals(ch1, ch2)) {
				return true;
			} else {
				return false;
			}
		}

	}

	public static void main(String[] args) {
		boolean hi = areAnagrams(new String(), new String());
		System.out.println(hi);
		char n = 'n';
		//		n = n.toUper
	}

}
