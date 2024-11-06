package ArrayAndArrayList;

import java.util.ArrayList;

public class ArrayListIntro {

	public static void main(String[] args) {
		ArrayList<String> arraylist = new ArrayList<>();
		arraylist.add("Keshab");
		arraylist.add("prabhat");
		arraylist.add("Ganesh");
		arraylist.add("Hi");
		System.out.println(arraylist);
		arraylist.remove("prabhat");
		System.out.println(arraylist);
		String name = arraylist.remove(0);
		System.out.println(name);
		System.out.println(arraylist);
	}

}
