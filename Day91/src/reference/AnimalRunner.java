package reference;

public class AnimalRunner {
	public static void main(String[] args) {
		Animal dog = new Animal(12);
		Animal cat = new Animal(15);
		Animal nothing;
		nothing = cat;
		System.out.println(cat.id);
		System.out.println(nothing.id);

		nothing.id = 255;
		System.out.println(cat.id);
		System.out.println(nothing.id);

		nothing = dog;
		System.out.println(nothing.id);
		nothing.id = 69;
		System.out.println(nothing.id);
		System.out.println(cat.id);
		System.out.println(dog.id);
	}
}
