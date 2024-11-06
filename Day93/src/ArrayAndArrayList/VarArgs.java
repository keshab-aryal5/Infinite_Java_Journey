package ArrayAndArrayList;

public class VarArgs {
	public static int sum(int... a) {
		int sum = 0;
		for (int m : a) {
			sum += m;
		}
		return sum;
	}
	public static void main(String[] args) {
		System.out.println(sum(2, 3, 4));
		System.out.println(sum(1, 2, 3, 4, 5));
	}
}
