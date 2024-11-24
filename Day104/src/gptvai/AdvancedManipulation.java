package gptvai;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class AdvancedManipulation {

}

class ascendingSorting implements Comparator<Student> {

	@Override
	public int compare(Student o1, Student o2) {
		return o1.getName().compareTo(o2.getName());
	}

}
class descMarkSorting implements Comparator<Student> {

	@Override
	public int compare(Student o1, Student o2) {
		// TODO Auto-generated method stub
		return Integer.compare(o2.getMarks(), o1.getMarks());
	}

}
class Student implements Comparable<Student> {
	private String name;
	private int marks;

	public Student(String name, int marks) {
		this.name = name;
		this.marks = marks;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String n) {
		this.name = n;
	}

	public int getMarks() {
		return this.marks;
	}

	public void setMarks(int m) {
		this.marks = m;
	}

	@Override
	public String toString() {
		return this.name + " " + this.marks;
	}

	@Override
	public int compareTo(Student that) {
		// TODO Auto-generated method stub
		return Integer.compare(this.marks, that.marks);
	}

}

class Question6 {
	private List<Integer> number;

	public void getNumber() {
		System.out.println(this.number);
	}
	public Question6(ArrayList<Integer> num) {
		this.number = num;
	}

	public void removeEven() {
		Iterator iter = this.number.iterator();
		while (iter.hasNext()) {
			if (((Integer) iter.next()) % 2 == 0) {
				iter.remove();
			}
		}
	}
}

class Question10 {
	private List<Integer> numberInteger;

	public Question10(ArrayList<Integer> arr) {
		this.numberInteger = arr;
	}

	public void removeDuplicates() {
		for (int i = 0; i < this.numberInteger.size(); i++) {
			int lastIndex = numberInteger.lastIndexOf(numberInteger.get(i));
			do {
				numberInteger.remove(lastIndex);
				lastIndex = numberInteger.lastIndexOf(numberInteger.get(i));
			} while (lastIndex != i);
		}
	}

	public void printList() {
		System.out.println(this.numberInteger);
	}
}