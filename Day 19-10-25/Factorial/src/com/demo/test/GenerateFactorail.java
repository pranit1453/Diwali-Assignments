package com.demo.test;

import java.util.Scanner;

import com.demo.services.FactorailService;
import com.demo.services.FactorialServiceImpl;

public class GenerateFactorail {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		FactorailService fservice = new FactorialServiceImpl();

		String ans;
		do {
			try {
				System.out.print("Enter number to find Factorail: ");
				int n = sc.nextInt();
				sc.nextLine();
				long res = fservice.generateFactorail(n);
				System.out.println("Factorial of " + n + " is : " + res);
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
			System.out.println("Factorail Successfully Generated...");
			System.out.print("Do you want to check another number? (y/n): ");
			ans = sc.next();
		} while (ans.equalsIgnoreCase("y"));

		sc.close();
		System.out.println("Factorail code is terminated.....");
	}

}
