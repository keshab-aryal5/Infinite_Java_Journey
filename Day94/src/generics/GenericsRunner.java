package generics;

import java.util.ArrayList;
import java.util.List;

public class GenericsRunner {

	public static <X> X doubleValue(X value) {
		return value;
	}

	public static <X extends List> void duplicateList(X list) {
		list.addAll(list);

	}

	static double sumOfNumberList(List<? extends Number> numbers) {
		double value = 0.0;
		for (Number number : numbers) {
			value += number.doubleValue();
		}
		return value;
	}
	public static void main(String[] args) {

		ArrayList list1 = doubleValue(new ArrayList());

		ArrayList<Integer> numbers = new ArrayList<>(List.of(1, 2, 3));
		duplicateList(numbers);

		System.out.println(numbers);

		MyCustomeList<Long> list = new MyCustomeList<>();
		list.addElement(5L);
		list.addElement(7L);

		MyCustomeList<Integer> list2 = new MyCustomeList<>();
		list2.addElement(70);
		list2.addElement(90);

		System.out.println(list);
		System.out.println(list2);

		System.out.println(list.getElement(0));
		System.out.println(list2.getElement(0));
	}

}
