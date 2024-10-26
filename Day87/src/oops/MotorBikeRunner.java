package oops;

public class MotorBikeRunner {

	public static void main(String[] args) {
		MotorBike ducati = new MotorBike("Ducati");
		MotorBike honda = new MotorBike("Honda");
		ducati.start();
		honda.start();
		ducati.setSpeed(20);
		honda.setSpeed(40);

		//		System.out.println(ducati.getSpeed());
		//		System.out.println(honda.getSpeed());
	}

}