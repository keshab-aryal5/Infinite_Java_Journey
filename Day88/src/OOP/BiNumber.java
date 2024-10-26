package OOP;

public class BiNumber {
	private int number1;
	private int number2;

	public BiNumber(int a, int b) {
		this.number1 = a;
		this.number2 = b;
	}

	public int add() {
		return number1 + number2;
	}

	public int multiply() {
		return number1 * number2;
	}

	public int getNumber1() {
		return this.number1;
	}

	public int getNumber2() {
		return this.number2;
	}

	public void doubleNum() {
		this.number1 *= 2;
		this.number2 *= 2;
	}

	public static void main(String[] args) {
		BiNumber numbers = new BiNumber(2, 3);
		System.out.println(numbers.add());
		System.out.println(numbers.multiply());
		numbers.doubleNum();
		System.out.println(numbers.getNumber1());
		System.out.println(numbers.getNumber2());
	}
}
