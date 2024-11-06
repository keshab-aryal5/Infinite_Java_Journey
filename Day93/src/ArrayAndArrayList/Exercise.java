package ArrayAndArrayList;

public class Exercise {

	public static void main(String[] args) {
		String[] weekDays = new String[] { "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday",
				"Saturday" };
		String longestDay = findHigh(weekDays);
		System.out.println("Most number of letters are in "+longestDay);
		printBackward(weekDays);
	}

	public static String findHigh(String[] week) {
		int len = 0;
		String longest = "";
		for (String day : week) {
			if (day.length() > len) {
				len = day.length();
				longest = day;
			}
		}
		return longest;
	}

	public static void printBackward(String[] week) {
		for (String str : week) {
			StringBuilder sbl = new StringBuilder(str);
			System.out.println(sbl.reverse());
		}
	}

}
