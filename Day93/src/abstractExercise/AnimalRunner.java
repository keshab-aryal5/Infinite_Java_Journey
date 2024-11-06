package abstractExercise;

public class AnimalRunner {

	public static void main(String[] args) {
		Animal[] animals = { new Dog(), new Cat() };

		for (Animal a : animals) {
			a.bark();
		}
	}

}
