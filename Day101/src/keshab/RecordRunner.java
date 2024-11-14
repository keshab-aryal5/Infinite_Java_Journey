package keshab;

public class RecordRunner {
	record Person(String name, String email, String phoneNumber) {
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person person = new Person("Ranga","keshabaryal152@gmail.com","123456789");
		Person person1 = new Person("Ranga", "keshabaryal152@gmail.com", "123456789");
		Person person2 = new Person("Ranga1", "keshabaryal152@gmail.com", "123456789");
		//		System.out.println(person);
		//		System.out.println(person.equals(person1));
		//		System.out.println(person.equals(person2));
		System.out.println(person.name);
	}

}