// Solution of Object-Oriented Programming and BigDecimal problem
//
// Created by Aurimas A. Nausedas on 05/11/20.
// Updated by Aurimas A. Nausedas on 07/11/21.

package aurimas.oops;

import java.math.BigDecimal;

public class SImpleInterestCalculatorRunner {

	public static void main(String[] args) {
		SimpleInterestCalculator calculator = new SimpleInterestCalculator("4500", "7.5");
		BigDecimal totalValue = calculator.calculateTotalValue(5);
		System.out.println(totalValue);

	}

}
