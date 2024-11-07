package schoolSystem;

public class Student implements Comparable<Student> {
	private float percentage;
	private String fullname;
	private int roll;
	private int grade;

	public Student(float percentage, String fullname, int roll, int grade) {
		super();
		this.percentage = percentage;
		this.fullname = fullname;
		this.roll = roll;
		this.grade = grade;
	}

	public float getPercentage() {
		return percentage;
	}

	public void setPercentage(float percentage) {
		this.percentage = percentage;
	}

	public String getFullname() {
		return fullname;
	}

	public void setFullname(String fullname) {
		this.fullname = fullname;
	}

	public int getRoll() {
		return roll;
	}

	public void setRoll(int roll) {
		this.roll = roll;
	}

	public int getGrade() {
		return grade;
	}

	public void setGrade(int grade) {
		this.grade = grade;
	}

	@Override
	public String toString() {
		return String.format("FullName - %s, roll.no - %d, grade - %d, percentate - %f", fullname, roll, grade,
				percentage);
	}

	@Override
	public int compareTo(Student that) {
		return Integer.compare(this.roll, that.roll);
	}

}
