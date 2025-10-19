package com.demo.test;

import java.util.List;
import java.util.Scanner;

import com.demo.services.FibnoService;
import com.demo.services.FibnoServiceImpl;

public class GenerateFibnoSeries {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		FibnoService fservice = new FibnoServiceImpl();
		String ans = null;
		do {
			try {
				System.out.print("Enter number for fibonacci series: ");
				int n = sc.nextInt();

				if (n <= 0) {
					System.out.println("Please enter a positive number.");
					continue;
				}

				List<Integer> fibonacci = fservice.generateFibonacciSeries(n);
				if (fibonacci != null && !fibonacci.isEmpty()) {
					for (int nums : fibonacci) {
						System.out.print(nums + "\t");
					}
					System.out.println();
				}
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
			System.out.println("Fibonacci Generated Successfully");
			System.out.print("Do you want to check another number? (y/n): ");
			ans = sc.next();
		} while (ans.equalsIgnoreCase("y"));

		sc.close();
		System.out.println("Fibonacci Series code is terminated.....");
	}

}
