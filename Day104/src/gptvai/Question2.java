package gptvai;

import java.util.ArrayList;
import java.util.List;

//Write a method to check if a particular element exists in a List. Return its index if it exists, or -1 if it doesn’t.
public class Question2 {
	private List<Integer> arr;

	public Question2(ArrayList<Integer> brr) {
		this.arr = brr;
	}

	public int giveIndex(int element) {
		return this.arr.indexOf(element);
	}

}
