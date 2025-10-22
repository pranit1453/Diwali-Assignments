package com.demo.test;

import java.util.Scanner;

import com.demo.services.MultiplicationServices;
import com.demo.services.MultiplicationServicesImpl;

public class MultiplicationTable {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		MultiplicationServices mservices = new MultiplicationServicesImpl();

		String ans = null;
		do {
			try {
				System.out.print("Enter Number: ");
				double n = sc.nextDouble();

				mservices.MultiplicationTable(n);

			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
			System.out.println("Multiplication Table is done");
			System.out.print("Do you want to check for another number? (y/n): ");
			ans = sc.next();
		} while (ans.equalsIgnoreCase("y"));

		sc.close();
		System.out.println("Multiplication Table  is successfully terminated....");

	}

}
