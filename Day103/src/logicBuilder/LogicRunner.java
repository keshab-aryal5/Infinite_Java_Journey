package logicBuilder;

public class LogicRunner {

	public static void main(String[] args) {
		Day22 day22 = new Day22(100);
		day22.printPrimeSum();

		Day24 day24 = new Day24(new int[] { 0, 1, 5, 6, 0, 8, 3, 0, 2, 0, 2, 0 });
		System.out.println(day24.findSum());

		Day25 day25 = new Day25(new int[] { 1, 2, 34, 3, 4, 5, 7, 23, 12 });
		System.out.println(day25.hasConsequetiveOdd());
	}

}
