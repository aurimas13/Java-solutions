// Created by Aurimas A. Nausedas on 13/11/20.
// Updated by Aurimas A. Nausedas on 07/11/21.
//
// Solution of Object-Oriented Programming problem 

package aurimas.oops; 

public class BiNumberRunner {

	public static void main(String[] args) {

		BiNumber numbers = new BiNumber(2, 3);

		numbers.add();
		numbers.multiply();
		numbers.Double();
		System.out.println(numbers.getNumber1());
		System.out.println(numbers.getNumber2());
	}
	
}
