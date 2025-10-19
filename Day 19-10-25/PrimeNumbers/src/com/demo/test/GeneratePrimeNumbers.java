package com.demo.test;

import java.util.Scanner;
import java.util.Set;

import com.demo.services.PrimeNumberService;
import com.demo.services.PrimeNumberServiceImpl;

public class GeneratePrimeNumbers {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		PrimeNumberService pservice = new PrimeNumberServiceImpl();
		String ans;
		do {
			try {
				System.out.print("Enter (upto check) number :");
				int n = sc.nextInt();
				sc.nextLine();

				// to store values we make use of set as it not store duplicates.
				Set<Integer> primes = pservice.generateAllPrimeNumber(n);

				if (primes != null && !primes.isEmpty()) {
					for (int nums : primes) {
						System.out.print(nums + "\t");
					}
					System.out.println();
				} else {
					System.out.println("Error in Generating Prime Numbers!!!");
				}

			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
			System.out.println("Prime Numbers Generated");
			System.out.print("Do you want to generate another prime numbers? (y/n): ");
			ans = sc.next();
		} while (ans.equalsIgnoreCase("y"));
		sc.close();
		System.out.println("Prime number code is terminated.....");
	}

}
