package studentCollection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class DescendingStudentComparator implements Comparator<Student> {

	@Override
	public int compare(Student o1, Student o2) {
		return Integer.compare(o2.getId(), o1.getId());
	}

}
public class StudentRunner {

	public static void main(String[] args) {
		List<Student> student = List.of(new Student(1, "Keshab"), new Student(2, "Madam"), new Student(0, "Hir"));

		List<Student> studentsAl = new ArrayList<>(student);
		//		Collections.sort(studentsAl);
		System.out.println(studentsAl);

		Collections.sort(studentsAl, new DescendingStudentComparator());
		System.out.println(studentsAl);
	}
}
