package com.in28minutes.oops; // Solution of Object-Oriented Programming and BigDecimal problem 

import java.math.BigDecimal;

public class SimpleInterestCalculator {

	BigDecimal principal;

	BigDecimal interest;

	public SimpleInterestCalculator(String principal, String interest) {
		this.principal = new BigDecimal(principal);
		this.interest = new BigDecimal(interest).divide(new BigDecimal(100));
}

	public BigDecimal calculateTotalValue(int noOfYears) {
		//	Total value = principal + principal * interest * noOfYears;
		BigDecimal noOfYearsDecimal = new BigDecimal(noOfYears);
		BigDecimal totalValue = principal.add(
				principal.multiply(interest)
						.multiply(noOfYearsDecimal));
		return totalValue;
	}

}
