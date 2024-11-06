package inheritanceBasics;

public class Employee extends Person {
	private String title;
	private String employer;
	private char employeeGrade;
	private String salary;

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getEmployer() {
		return employer;
	}

	public void setEmployer(String employer) {
		this.employer = employer;
	}

	public char getEmployeeGrade() {
		return employeeGrade;
	}

	public void setEmployeeGrade(char employeeGrade) {
		this.employeeGrade = employeeGrade;
	}

	public String getSalary() {
		return salary;
	}

	public void setSalary(String salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return String.format("Name - %s Phone - %s Email - %s Title - %s employer - %s employeeGrade - %c Salary - %s",
				this.getName(), this.getPhone(), this.getEmail(), this.title, this.employer, this.employeeGrade,
				this.salary);
	}
}
