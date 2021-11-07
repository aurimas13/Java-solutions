// Created by Aurimas A. Nausedas on 13/10/20.
// Updated by Aurimas A. Nausedas on 07/11/21.
//

package aurimas.oops; // Solution of Object-Oriented Programming problem 

public class BiNumber {

	private int number1;
	private int number2;

	BiNumber() {

	}
	BiNumber(int number1, int number2) {
		this.number1 = number1;
		this.number2 = number2;
	}

	void add() {
		System.out.println(number1 + number2);
	}

	void multiply() {
		System.out.println(number1 * number2);
	}

	void Double() {
		System.out.println(number1 * 2);
		System.out.println(number2 * 2);
	}

	public int getNumber1() {
		return number1;
	}

	public void setNumber1(int number1) {
		this.number1 = number1;
	}

	public int getNumber2() {
		return number2;
	}

	public void setNumber2(int number2) {
		this.number2 = number2;
	}

}
