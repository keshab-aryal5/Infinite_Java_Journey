package inheritanceBasics;

public class EmployeeRunner {

	public static void main(String[] args) {
		Employee emp = new Employee();
		emp.setName("Keshab Aryal");
		emp.setPhone("9869393678");
		emp.setEmail("keshabaryal152@gmail.com");
		emp.setTitle("Lead Software Engineer");
		emp.setEmployer("Senior");
		emp.setEmployeeGrade('A');
		emp.setSalary("123456789$");

		System.out.println(emp);
	}

}
