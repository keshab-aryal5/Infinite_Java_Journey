package oopRevision;

public class CustomerRunner {

	public static void main(String[] args) {
		String name = "Keshab Aryal";
		Address homeAddress = new Address("New Baneshwor", "Kathmandu", "44600");
		Customer customer = new Customer(name, homeAddress);
		System.out.println(customer.getHomeAddress());
		System.out.println(customer.getWorkAddress());

		Address workAddress = new Address("Kale chor", "hora", "34343");
		customer.setWorkAddress(workAddress);

		System.out.println(customer.getWorkAddress());
		System.out.println(customer.getHomeAddress());
	}

}
