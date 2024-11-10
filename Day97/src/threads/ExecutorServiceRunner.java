package threads;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorServiceRunner {

	public static void main(String[] args) {
		//		ExecutorService executorService = Executors.newSingleThreadExecutor();
		ExecutorService executorService = Executors.newFixedThreadPool(2);
		executorService.execute(new Task1(1));
		executorService.execute(new Task1(2));
		executorService.execute(new Task1(3));
		executorService.execute(new Task1(4));
		executorService.execute(new Task1(5));
		executorService.shutdown();
	}

}
