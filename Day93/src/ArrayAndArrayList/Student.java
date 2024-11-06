package ArrayAndArrayList;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Collections;

public class Student {
	private String name;
	private ArrayList<Integer> marks = new ArrayList<>();

	public Student(String sname, int... number) {
		this.name = sname;
		for (int mark : number) {
			this.marks.add(mark);
		}
	}

	int getNumberOfMarks() {
		return this.marks.size();
	}

	int getTotalSumOfMarks() {
		int sum = 0;
		for (int mark : this.marks) {
			sum += mark;
		}
		return sum;
	}

	int getMaximumMarks() {
		return Collections.max(marks);
	}

	int getMinimumMarks() {
		return Collections.min(marks);
	}

	BigDecimal getAverageMarks() {
		int total = this.getTotalSumOfMarks();
		int marks = this.getNumberOfMarks();
		return new BigDecimal(total).divide(new BigDecimal(marks), 3, RoundingMode.UP);

	}

	@Override
	public String toString() {
		return name + marks;
	}

	public void addNewMark(int mark) {
		this.marks.add(mark);
	}

	public void removeMarkAtIndex(int i) {
		this.marks.remove(i);
	}

}
