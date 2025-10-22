package com.demo.test;

import java.util.Scanner;

import com.demo.services.SumServices;
import com.demo.services.SumServicesImpl;

public class SumOfNDigit {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		SumServices sservices = new SumServicesImpl();

		String ans = null;
		do {
			try {
				System.out.print("Enter Number: ");
				double n = sc.nextDouble();

				double res = sservices.sumOfnDigit(n);

				System.out.println("Result of " + n + " Digits is : " + res);
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
			System.out.println("Sum Of N Digits is done");
			System.out.print("Do you want to check for another number? (y/n): ");
			ans = sc.next();
		} while (ans.equalsIgnoreCase("y"));

		sc.close();
		System.out.println("Sum Of N Digits is successfully terminated....");

	}

}
