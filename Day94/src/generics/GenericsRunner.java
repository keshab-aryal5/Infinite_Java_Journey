package generics;

public class GenericsRunner {

	public static void main(String[] args) {
		MyCustomeList<String> list = new MyCustomeList<>();
		list.addElement("Element 1");
		list.addElement("Element 2");

		MyCustomeList<Integer> list2 = new MyCustomeList<>();
		list2.addElement(70);
		list2.addElement(90);

		System.out.println(list);
		System.out.println(list2);

		System.out.println(list.getElement(0));
		System.out.println(list2.getElement(0));
	}

}
