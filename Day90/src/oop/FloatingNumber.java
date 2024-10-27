package oop;

import java.math.BigDecimal;

public class FloatingNumber {
	public static void main(String[] args) {
		BigDecimal number1 = new BigDecimal("34.56789876");
		BigDecimal number2 = new BigDecimal("34.2234");
		System.out.println(number1.add(number2));

	}
}
