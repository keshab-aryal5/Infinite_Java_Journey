package modularization.sorting.util;

import java.util.List;

import modularization.sorting.algorithm.BubbleSort;

public class MySortingUtil {
	public List<String> sort(List<String> names) {
		BubbleSort bubbleSort = new BubbleSort();
		return bubbleSort.sort(names);

	}

}
