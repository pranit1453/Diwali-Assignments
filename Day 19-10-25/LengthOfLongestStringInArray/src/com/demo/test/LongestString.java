package com.demo.test;

import java.util.Scanner;

import com.demo.services.StringService;
import com.demo.services.StringServiceImpl;

public class LongestString {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringService sservice = new StringServiceImpl();

		String ans;
		do {
			try {

				System.out.print("Enter String size : ");
				int size = sc.nextInt();
				sc.nextLine();

				String[] arr = new String[size];

				System.out.println("Enter strings in array--");
				for (int i = 0; i < size; i++) {
					System.out.print("String " + (i + 1) + ": ");
					arr[i] = sc.nextLine();
				}

				int maxLength = sservice.longestStringInArray(arr);
				System.out.println("Longest length of String is " + maxLength);

			} catch (Exception e) {
				System.out.println("Error : " + e.getMessage());
			}

			System.out.println("String is Checked");
			System.out.print("Do you want to check another number? (y/n): ");
			ans = sc.next();

		} while (ans.equalsIgnoreCase("y"));

		sc.close();
		System.out.println("String length code is terminated.....");

	}

}
