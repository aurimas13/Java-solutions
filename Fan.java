package aurimas.oops.level2;

public class Fan {

	// state
	private String make;
	private double radius;
	private String colour;

	private boolean isOn;
	private byte speed; // 0 to 5

	// creation
	public Fan(String make, double radius, String colour) {
		this.make = make;
		this.radius = radius;
		this.colour = colour;
	}

	// isOn
	public void isOn(boolean isOn) {
		this.isOn = isOn;
	}

	public void switchOn() {
		this.isOn = true;
		setSpeed((byte) 20);
	}

	public void switchOff() {
		this.isOn = false;
		setSpeed((byte) 0);
	}

	public void setSpeed(byte speed) {
		this.speed = speed;
	}

	// print the state
	@Override
	public String toString() {
		return String.format("make - %s, radius - %f, colour - %s, isOn - %b, speed - %d",
				make, radius, colour, isOn, speed);
	}

}
