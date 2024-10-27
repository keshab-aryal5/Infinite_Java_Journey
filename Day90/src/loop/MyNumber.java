package loop;

public class MyNumber {
	private int number;
	public MyNumber(int i) {
		this.number = i;
	}

	public boolean isPrime() {
		// TODO Auto-generated method stub
		if (this.number <= 1) {
			return false;
		} else {
			int sum = 0;
			int count = 0;
			for (int i = 2; i <= number / 2; i++) {
				if (number % i == 0) {
					count++;
				}
			}
			if (count == 0) {
				return true;
			} else {
				return false;
			}
		}
	}

	public int sumUptoN() {
		int sum = 0;
		for (int i = 1; i <= number; i++) {
			sum += i;
		}
		return sum;
	}

	public int sumOfDivisor() {
		int sum = 0;
		for (int i = 1; i <= number / 2; i++) {
			if (number % i == 0) {
				sum += i;
			}
		}
		sum += number;
		return sum;
	}

	public void printANumberTriangle() {
		for (int i = 1; i <= number; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
	}

}
