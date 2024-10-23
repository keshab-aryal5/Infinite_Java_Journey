package oops;

public class BookRunner {
	public static void main(String[] args) {
		Book artOfComputerProgramming = new Book();
		Book effectiveJava = new Book();
		Book cleanCode = new Book();

		artOfComputerProgramming.setNumberOfCopies(20);
		effectiveJava.setNumberOfCopies(100);
		cleanCode.setNumberOfCopies(50);

	}
}
