package com.demo.beans;

import com.demo.exception.WrongOperatorException;

public class Calculator {
	public static int calculate(int number1, int number2, String operator) throws WrongOperatorException {
		switch (operator) {
		case "+":
			return number1 + number2;
		case "-":
			return number1 - number2;
		case "*":
			return number1 * number2;
		case "/":
			if (number2 == 0) {
				throw new ArithmeticException("Division by 0 is not allowed!!");
			}
			return number1 / number2;
		case "%":
			if (number2 == 0) {
				throw new ArithmeticException("Modulo by 0 is not allowed!!");
			}
			return number1 % number2;
		default:
			throw new WrongOperatorException("Invalid Operator: " + operator);
		}

	}
}
