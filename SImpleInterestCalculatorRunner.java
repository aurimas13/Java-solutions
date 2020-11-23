package com.in28minutes.oops; // Solution of Object-Oriented Programming and BigDecimal problem

import java.math.BigDecimal;

public class SImpleInterestCalculatorRunner {

	public static void main(String[] args) {
		SimpleInterestCalculator calculator = new SimpleInterestCalculator("4500", "7.5");
		BigDecimal totalValue = calculator.calculateTotalValue(5);
		System.out.println(totalValue);

	}

}
