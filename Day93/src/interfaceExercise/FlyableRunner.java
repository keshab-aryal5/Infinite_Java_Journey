package interfaceExercise;

public class FlyableRunner {

	public static void main(String[] args) {
		Flyable[] flyingObjects = { new Bird(), new Aeroplane() };
		for (Flyable abc : flyingObjects) {
			abc.fly();
		}
	}

}
