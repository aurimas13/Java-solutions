// Created by Aurimas A. Nausedas on 16/11/20.
// Updated by Aurimas A. Nausedas on 07/11/21.
//
// Solution of Object-Oriented Programming problem

package aurimas.oops; 

public class MotorBikeRunner {

	public static void main(String[] args) {

		MotorBike ducati = new MotorBike(100);
		MotorBike honda = new MotorBike(200);
		MotorBike suzuki = new MotorBike();

		System.out.println(ducati.getSpeed());
		System.out.println(honda.getSpeed());
		System.out.println(suzuki.getSpeed());

		ducati.start();
		honda.start();

//		ducati.setSpeed(100);

		ducati.increaseSpeed(100);
		honda.increaseSpeed(100);

		ducati.decreaseSpeed(50);
		honda.decreaseSpeed(50);

		int ducatiSpeed = ducati.getSpeed(); // get ducati speed
		ducatiSpeed += 100; // increase it by 100
		ducati.setSpeed(ducatiSpeed); // set it to ducati

		int hondaSpeed = honda.getSpeed(); // get honda speed
		hondaSpeed += 100; // increase it by 100
		honda.setSpeed(hondaSpeed); // set it to honda

		System.out.println(ducati.getSpeed());
		System.out.println(honda.getSpeed());

	}

}
