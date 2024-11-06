package ArrayAndArrayList;

public class StudentRunner {

	public static void main(String[] args) {
		Student keshab = new Student("Keshab Aryal", 100, 100, 100);
		System.out.println(keshab.getNumberOfMarks());
		System.out.println(keshab.getTotalSumOfMarks());
		System.out.println(keshab.getMaximumMarks());
		System.out.println(keshab.getMinimumMarks());
		System.out.println(keshab.getAverageMarks());
		System.out.println(keshab);
		keshab.addNewMark(35);
		keshab.removeMarkAtIndex(1);
		System.out.println(keshab);
	}

}
