package com.demo.test;

import java.util.Arrays;
import java.util.Scanner;

import com.demo.services.ArrayServices;
import com.demo.services.ArrayServicesImpl;

public class MergeArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayServices mservices = new ArrayServicesImpl();

		String ans = null;
		do {
			try {
				System.out.print("Enter Size (n): ");
				int n = sc.nextInt();
				int[] num1 = new int[n];
				int[] num2 = new int[n];

				System.out.println("Enter " + n + " elements for num1.");
				for (int i = 0; i < n; i++) {
					num1[i] = sc.nextInt();
				}

				System.out.println("Enter " + n + " elements for num2.");
				for (int i = 0; i < n; i++) {
					num2[i] = sc.nextInt();
				}

				int[] res = mservices.mergeArray(num1, num2);
				System.out.println("Merged Array is: " + Arrays.toString(res));

			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
			System.out.println("Merged Array is done");
			System.out.print("Do you want to check for another number? (y/n): ");
			ans = sc.next();
		} while (ans.equalsIgnoreCase("y"));

		sc.close();
		System.out.println("Merged Array is successfully terminated....");

	}

}
