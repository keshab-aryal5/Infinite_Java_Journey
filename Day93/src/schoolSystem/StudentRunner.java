package schoolSystem;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
public class StudentRunner {

	public static void main(String[] args) {
		List<Student> std = new ArrayList<>(List.of(new Student(84.57f, "Keshab Aryal", 5, 25),
				new Student(57.54f, "Prabhat Aryal", 35, 23), new Student(95.34f, "Manish Aryal", 6, 73)));

		//		Iterator content = std.iterator();
		//		while (content.hasNext()) {
		//			System.out.println(content.next());
		//		}

		Collections.sort(std);
		Iterator content = std.iterator();
		while (content.hasNext()) {
			System.out.println(content.next());
		}
	}

}
