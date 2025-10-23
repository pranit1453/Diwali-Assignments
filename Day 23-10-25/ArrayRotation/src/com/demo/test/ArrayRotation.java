package com.demo.test;

import java.util.Arrays;
import java.util.Scanner;

import com.demo.services.ArrayServices;
import com.demo.services.ArrayServicesImpl;

public class ArrayRotation {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayServices mservices = new ArrayServicesImpl();

		String ans = null;
		do {
			try {
				System.out.print("Enter Size (n): ");
				int n = sc.nextInt();
				int[] arr = new int[n];

				System.out.println("Enter " + n + " elements.");
				for (int i = 0; i < n; i++) {
					arr[i] = sc.nextInt();
				}

				System.out.print("Enter number of steps (k): ");
				int k = sc.nextInt();

				int[] res = mservices.rotate(arr, k);
				System.out.println("Array after rotating " + k + " steps to right: " + Arrays.toString(res));

			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
			System.out.println("Array rotation is done");
			System.out.print("Do you want to check for another number? (y/n): ");
			ans = sc.next();
		} while (ans.equalsIgnoreCase("y"));

		sc.close();
		System.out.println("Array Rotation is successfully terminated....");

	}

}
