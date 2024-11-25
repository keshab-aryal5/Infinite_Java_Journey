package setInterface;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapRunner {

	public static void main(String[] args) {
		//		Map<String, Integer> map = Map.of("A", 3, "B", 5, "Z", 10);
		//		System.out.println(map);
		//
		//		System.out.println(map.get("Z"));
		//		System.out.println(map.containsKey("B"));
		//		System.out.println(map.containsValue(3));

		Map<String, Integer> hashMap = new HashMap<>();
		hashMap.put("A", 20);
		hashMap.put("B", 10);
		hashMap.put("C", 5);

		System.out.println(hashMap);

		LinkedHashMap<String, Integer> linkedHashMap = new LinkedHashMap<>();
		linkedHashMap.put("Z", 100);
		linkedHashMap.put("C", 10);
		linkedHashMap.put("A", 10);
		System.out.println(linkedHashMap);

		TreeMap<String, Integer> treeMap = new TreeMap<>();
		treeMap.put("Z", 10);
		treeMap.put("B", 100);
		treeMap.put("C", 5);
		System.out.println(treeMap);


	}

}
