package com.demo.test;

import java.util.Scanner;

import com.demo.services.MissingNumberServices;
import com.demo.services.MissingNumberServicesImpl;

public class MissingNumberArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		MissingNumberServices mservices = new MissingNumberServicesImpl();

		String ans = null;
		do {
			try {
				System.out.print("Enter Size (n): ");
				int n = sc.nextInt();
				int[] arr = new int[n];

				System.out.println("Enter " + n + " elements , one missing.");
				for (int i = 0; i < n; i++) {
					arr[i] = sc.nextInt();
				}

				int res = mservices.missingNumber(arr, n);
				System.out.println("Missing Number is: " + res);

			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
			System.out.println("Missing numbers in Array is done");
			System.out.print("Do you want to check for another number? (y/n): ");
			ans = sc.next();
		} while (ans.equalsIgnoreCase("y"));

		sc.close();
		System.out.println("Missing number is successfully terminated....");

	}

}
