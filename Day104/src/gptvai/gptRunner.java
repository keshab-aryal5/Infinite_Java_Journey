package gptvai;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class gptRunner {

	public static void main(String[] args) {
		Question1 ques = new Question1(new ArrayList<>());
		ques.addToList(10);
		ques.addToList(10);
		ques.addToList(10);
		ques.addToList(10);
		ques.addToList(10);
		ques.addToList(10);
		ques.addToList(10);
		ques.addToList(10);
		ques.addToList(10);
		ques.addToList(10);
		ques.addToList(10);
		ques.addToList(10);

		ques.printList();
		ques.removeFromIndex(5);
		ques.printList();

		Question2 ques2 = new Question2(new ArrayList<Integer>(List.of(1, 2, 3, 4)));
		System.out.println(ques2.giveIndex(201));

		Question3 ques3 = new Question3(
				new ArrayList<>(List.of("Kathmandu", "Pokhara", "Lumbini", "Hetauda", "Chitwan")));
		ques3.printUpperCase();

		List<Student> students = new ArrayList<>(
				List.of(new Student("Keshab", 25), new Student("Sumit ", 69), new Student("Ashok", 1)));
		System.out.println(students);
		Collections.sort(students);
		System.out.println(students);
		Collections.sort(students, new descMarkSorting());
		System.out.println(students);
		Collections.sort(students, new ascendingSorting());
		System.out.println(students);

		Question6 ques6 = new Question6(new ArrayList<>(List.of(2, 6, 5, 89, 10)));
		ques6.removeEven();
		ques6.getNumber();

		Question10 qu10 = new Question10(new ArrayList<>(List.of(2, 5, 5, 3, 5, 2, 6, 5)));
		qu10.printList();
		qu10.removeDuplicates();
		qu10.printList();

	}
}
