package loop;

public class WhileNumberPlayer {
	private int number;

	public WhileNumberPlayer(int i) {
		// TODO Auto-generated constructor stub
		this.number = i;
	}

	public void printSquareUptoLimit() {
		// TODO Auto-generated method stub
		int i = 1;
		while (i * i <= number) {
			System.out.print(i * i + " ");
			i++;
		}
		System.out.println();
	}

	public void printCubesUptoLimit() {
		// TODO Auto-generated method stub
		int i = 1;
		while (i * i * i <= number) {
			System.out.print(i * i * i + " ");
			i++;
		}
		System.out.println();
	}

}
