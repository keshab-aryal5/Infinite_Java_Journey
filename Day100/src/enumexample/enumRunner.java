package enumexample;

enum Season {
	WINTER, SPRING, SUMMER, FALL;
}
public class enumRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Season season = Season.FALL;

		Season season1 = Season.valueOf("WINTER");
		System.out.println(season1);
	}

}
