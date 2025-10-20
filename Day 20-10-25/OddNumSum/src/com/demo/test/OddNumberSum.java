package com.demo.test;

import java.util.Scanner;

import com.demo.services.OddService;
import com.demo.services.OddServiceImpl;

public class OddNumberSum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		OddService oservice = new OddServiceImpl();
		String ans = null;
		do {
			try {
				System.out.println("Enter number : ");
				int n = sc.nextInt();
				int sum = oservice.sumOfOddNumber(n);
				System.out.println("Sum of first " + n + " odd numbers is : " + sum);
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
			System.out.println("First n odd Number sum is successfully done....");
			System.out.print("Do you want to check for another number? (y/n) : ");
			ans = sc.next();
		} while (ans.equalsIgnoreCase("y"));

		sc.close();
		System.out.println("Odd number code is successfully terminated...");

	}

}
