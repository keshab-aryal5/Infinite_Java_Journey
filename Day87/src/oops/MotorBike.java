package oops;

public class MotorBike {
	String name;
	private int speed;

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
		System.out.println(speed);
		System.out.println();
	}

	public MotorBike(String name) {
		this.name = name;
	}

	void start() {
		System.out.println("Starting bike " + this.name);
	}

}
