package LogicBuilding;


import java.util.List;

public class LogicRunner {

	public static void main(String[] args) {
		Day11 day11 = new Day11("PrograMming", 'M');
		System.out.println(day11.findFrequency());

		Day12 day12 = new Day12();
		day12.printOutput();

		Day13 day13 = new Day13();
		day13.findOutput();

		Day14 day14 = new Day14(10);
		day14.buildFiboSequence();

		Day15 day15 = new Day15(100);
		day15.printPrime();

		Day16 day16 = new Day16(List.of(1, 1, 4, 2, 1, 3));
		day16.findWrongPlacedNumber();

		Day17 day17 = new Day17(List.of(7, 8, 9, 8, 10));
		day17.findDuplicate();

		Day18 day18 = new Day18(new int[] { 1, 2, 8, 4, 5, 7 });
		day18.reverseArray();

		Day19 day19 = new Day19(new int[] { 10, 20, 30, 40, 50, 60 });
		System.out.println("The Sum is " + day19.findEvenReverseSum());

		Day20 day20 = new Day20(List.of(1, 1, 0, 0, 1, 1, 1, 1, 0, 0, 1, 0));
		System.out.println(day20.countOne());

		Day21 day21 = new Day21(2124);
		day21.isLeapYear();

	}
}
