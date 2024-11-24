package gptvai;

import java.util.ArrayList;
import java.util.List;

//Write a program to create a List of integers. Add 10 numbers to the list, remove the 5th number, and print the list.
public class Question1 {
	private List<Integer> myList;

	public Question1(ArrayList<Integer> arr) {
		this.myList = arr;
	}

	public void addToList(int num) {
		this.myList.add(num);
	}

	public void removeFromIndex(int index) {
		this.myList.remove(index);
	}

	public void printList() {
		System.out.println(this.myList);
	}

}
