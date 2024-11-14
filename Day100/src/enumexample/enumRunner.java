package enumexample;

enum Season {
	private int value;

	WINTER(1), SPRING(2), SUMMER(3), FALL(4);

	private Season(int value) {
		this.value = value;
	}

	public int getValue() {
		return value;
	}
}
public class enumRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Season season = Season.FALL;

		Season season1 = Season.valueOf("WINTER");
		System.out.println(season1);
	}

}
