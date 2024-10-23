package oops;

public class MotorBike {
	String name;
	private int speed;

	void setSpeed(int speed) {
		this.speed = speed;
	}

	int getSpeed() {
		return this.speed;
	}
	public MotorBike(String name) {
		this.name = name;
	}

	void start() {
		System.out.println("Starting bike " + this.name);
	}

}
