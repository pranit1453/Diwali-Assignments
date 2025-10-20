package com.demo.test;

import java.util.Scanner;

import com.demo.services.EvenService;
import com.demo.services.EvenServiceImpl;

public class EvenNumberSum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		EvenService eservice = new EvenServiceImpl();
		String ans = null;
		do {
			try {
				System.out.println("Enter number : ");
				int n = sc.nextInt();
				int sum = eservice.sumOfEvenNumber(n);
				System.out.println("Sum of first " + n + " even numbers is : " + sum);
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
			System.out.println("First n even Number sum is successfully done....");
			System.out.print("Do you want to check for another number? (y/n) : ");
			ans = sc.next();
		} while (ans.equalsIgnoreCase("y"));

		sc.close();
		System.out.println("Even number code is successfully terminated...");
	}

}
