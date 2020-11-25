package aurimas.oops;

public class BiNumber3 {
	private int number3;
	private int number4;

	public BiNumber3(int number3, int number4) {
		this.number3 = number3;
		this.number4 = number4;
	}

	public int getNumber3() {
		return number3;
	}

	public void setNumber3(int number3) {
		this.number3 = number3;
	}

	public int getNumber4() {
		return number4;
	}

	public void setNumber4(int number4) {
		this.number4 = number4;
	}

	public int add() {
		return number3 + number4;
	}

	public int multiply() {
		return number3 * number4;
	}

	public void doubleValue() {
		this.number3 *= 2;
		this.number4 *= 2;
	}

}
