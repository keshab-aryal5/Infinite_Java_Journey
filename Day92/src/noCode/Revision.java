package noCode;
import java.time.LocalDate;
public class Revision {

	public static void main(String[] args) {
		LocalDate now = LocalDate.now();
		System.out.println(now);

		System.out.println(now.getYear());
		System.out.println(now.getMonth());
		System.out.println(now.getDayOfMonth());
		System.out.println(now.getDayOfYear());
		System.out.println(now.getDayOfWeek());

		System.out.println(now.isLeapYear());
		System.out.println(now.plusMonths(100));
	}

}
