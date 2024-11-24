package gptvai;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

//Create a List of strings containing names of 5 cities. Use an Iterator to print all the names in uppercase.
public class Question3 {
	private List<String> cities;

	public Question3(ArrayList<String> city) {
		this.cities = city;
	}

	public void printUpperCase() {
		Iterator iterateCity = cities.iterator();
		while (iterateCity.hasNext()) {
			System.out.println(((String) iterateCity.next()).toUpperCase());
		}
	}
}
