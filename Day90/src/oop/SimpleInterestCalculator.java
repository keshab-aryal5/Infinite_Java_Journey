package oop;

import java.math.BigDecimal;

public class SimpleInterestCalculator {
	private BigDecimal principle;
	private BigDecimal interest;

	public SimpleInterestCalculator(String num1, String num2) {
		this.principle = new BigDecimal(num1);
		this.interest = new BigDecimal(num2);
	}

	public BigDecimal calculateTotalValue(int i) {
		// TODO Auto-generated method stub
		BigDecimal product = principle.multiply(interest.multiply(new BigDecimal(i)));
		return principle.add(product.divide(new BigDecimal(100)));

	}
}
