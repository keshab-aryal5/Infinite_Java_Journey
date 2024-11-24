package revision;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class DescendingStudentComparator implements Comparator<Student> {

	@Override
	public int compare(Student o1, Student o2) {
		// TODO Auto-generated method stub
		return Integer.compare(o1.getId(), o2.getId());
	}

}
public class StudentClassRunner {

	public static void main(String[] args) {
		List<Student> students = List.of(new Student("Keshab", 23), new Student("Amrit", 234));
		List<Student> studentsAl = new ArrayList<>(students);
		System.out.println(studentsAl);
		Collections.sort(studentsAl);
		System.out.println(studentsAl);

		Collections.sort(studentsAl, new DescendingStudentComparator());
	}
}
