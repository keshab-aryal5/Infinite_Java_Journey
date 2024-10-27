package switchStatement;

public class switchClass {
	public static boolean isWeekDay(int dayNumber) {
		if (dayNumber >= 0 && dayNumber <= 6) {
			return true;
		} else {
			return false;
		}
	}

	public static String determineNameOfMonth(int monthNumber) {
		switch (monthNumber) {
		case 1:
			return "January";
		case 2:
			return "Feburary";
		case 3:
			return "March";
		default:
			return "other";

		}
	}

	public static String determineNameOfDay(int dayNumber) {
		switch (dayNumber) {
		case 1:
			return "Sun";
		default:
			return "JI";
		}
	}
	public static void main(String[] args) {
		System.out.println(isWeekDay(1));
		System.out.println(determineNameOfMonth(2));
		System.out.println(determineNameOfDay(1));
	}

}
