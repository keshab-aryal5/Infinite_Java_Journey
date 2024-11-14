package modularization.sorting.consumer;

import java.lang.System.Logger;
import java.util.List;

import modularization.sorting.util.MySortingUtil;

public class MySortingUtilConsumer {
	private static Logger logger = Logger.getLogger(MySortingUtilConsumer.class.getName());

	public static void main(String[] args) {
		MySortingUtil util = new MySortingUtil();
		List<String> sorted = util.sort(List.of("Ranga", "Ravi", "Sathish", "Adam", "Eve"));

		logger.info(sorted.toString());
	}
}
