package com.demo.test;

import java.util.Scanner;

import com.demo.services.PrimeNumberService;
import com.demo.services.PrimeNumberServiceImpl;

public class CheckPrimeNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		PrimeNumberService pservice = new PrimeNumberServiceImpl();
		String ans;
		do {
			try {

				System.out.print("Enter a Number: ");
				int n = sc.nextInt();
				boolean status = pservice.validatePrimeNumber(n);
				if (status) {
					System.out.println("The number " + n + " is a Prime number.");
				} else {
					System.out.println("It is not a prime number.");
				}
			} catch (Exception e) {
				System.out.println("Error : " + e.getMessage());
			}
			System.out.println("Prime Numbers Checked");
			System.out.print("Do you want to check another number? (y/n): ");
			ans = sc.next();

		} while (ans.equalsIgnoreCase("y"));

		sc.close();
		System.out.println("Prime number code is terminated.....");

	}

}
