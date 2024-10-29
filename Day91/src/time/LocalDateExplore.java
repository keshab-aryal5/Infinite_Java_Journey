package time;
import java.time.LocalDate;
import java.time.LocalDateTime;
public class LocalDateExplore {
	public static void main(String[] args) {
		LocalDate today = LocalDate.now();
		System.out.println(today);
		System.out.println(today.getYear());
		System.out.println(today.getDayOfYear());
		System.out.println(today.isLeapYear());
		System.out.println(today.lengthOfMonth());
		System.out.println(today.lengthOfYear());
		System.out.println(today.plusDays(69));
		System.out.println(today.plusMonths(100));
		System.out.println(today.plusYears(100));
		System.out.println(today.minusDays(100));

		LocalDateTime now = LocalDateTime.now();
		System.out.println(now.plusWeeks(400));
		System.out.println(now.plusHours(42));

		LocalDate todaynow = LocalDate.now();
		System.out.println(todaynow);
		LocalDate yesterday = LocalDate.of(2024, 2, 28);
		System.out.println(yesterday);

		LocalDate birthday = LocalDate.of(2001, 12, 10);
		int year = todaynow.getYear() - birthday.getYear();
		int month = todaynow.getMonthValue() - birthday.getMonthValue();
		int days = todaynow.getDayOfMonth() - birthday.getDayOfMonth();
		System.out.println(year);
		System.out.println(month);
		System.out.println(days);

		System.out.println(todaynow.withYear(2022));

		System.out.println(todaynow.withDayOfYear(36));

		System.out.println(todaynow.isAfter(birthday));
	}
}
