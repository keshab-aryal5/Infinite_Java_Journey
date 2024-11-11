package exceptionhandaling;

public class ExceptionHandalingRunner2 {

	public static void main(String[] args) {
		method1();
		System.out.println("Main Ended");
	}

	private static void method1() {
		method2();
		System.out.println("Method1 Ended");
	}

	private static void method2() {
		try {
			int[] i = { 1, 2 };
			int number = i[3];
			System.out.println("Method2 Ended");
		} catch (NullPointerException ex) {
			System.out.println("Null pointer Exception occured");
			ex.printStackTrace();
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}
}