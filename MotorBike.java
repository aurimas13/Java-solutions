// Solution of Object-Oriented Programming problem
//
// Created by Aurimas A. Nausedas on 16/11/20.
// Updated by Aurimas A. Nausedas on 07/11/21.

package aurimas.oops; 
public class MotorBike {

	// state
	private int speed; // member variable

	MotorBike() {
		this(5);
	}

	MotorBike(int speed) {
		this.speed = speed;
	}
	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		if (speed > 0)
		 {
			this.speed = speed;
		}
	}

	public void increaseSpeed(int howMuch) {
		setSpeed(this.speed + howMuch);
	}

	public void decreaseSpeed(int howMuch) {
		setSpeed(this.speed - howMuch);
	}

	void start() {
		System.out.println("Bike Started");
	}
}
