package threads;

class Task1 extends Thread {
	private int number;

	public Task1(int n) {
		this.number = n;
	}
	@Override
	public void run() {
		System.out.println("Task " + number + " starting");
		for (int i = 100 * number; i <= 100 * number + 99; i++) {
			System.out.print(i + " ");
		}
		System.out.println("\nTask " + number + " done");
	}
}

class Task2 implements Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("\nTask2 Started");
		for (int i = 201; i <= 299; i++) {
			System.out.print(i + " ");
		}
		System.out.println("\nTask2 Done");
	}

}
public class ThreadBasicsRunner {

	public static void main(String[] args) throws InterruptedException {
		Task1 task1 = new Task1(1);
		task1.setPriority(10);
		task1.start();
		Task2 task2 = new Task2();
		Thread thread = new Thread(task2);
		thread.start();

		task1.join();

		System.out.println("/nTask3 kicked off");
		for (int i = 301; i <= 399; i++) {
			System.out.print(i + " ");
		}
		System.out.println("\nTask3 Done");
	}
}

