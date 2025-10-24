package com.demo.test;

import java.util.Scanner;

import com.demo.beans.Calculator;
import com.demo.exception.WrongOperatorException;

public class TestingCalculator {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String ans = null;
		do {

			System.out.print("Enter first number: ");
			int num1 = sc.nextInt();
			System.out.print("Enter second number: ");
			int num2 = sc.nextInt();

			System.out.print("Enter Operator(+,-,*,/,%): ");
			String op = sc.next();

			try {
				int result = Calculator.calculate(num1, num2, op);
				System.out.println("Result: " + result);
			} catch (WrongOperatorException e) {
				System.out.println("Error : " + e.getMessage());
			} catch (ArithmeticException e) {
				System.out.println("Math Error : " + e.getMessage());
			}
			System.out.print("Do you want to check another operator? (y/n): ");
			ans = sc.next().trim();
			sc.nextLine();
		} while (ans.equalsIgnoreCase("y"));

		sc.close();
		System.out.println("Calculator code successfully terminated...");

	}

}
