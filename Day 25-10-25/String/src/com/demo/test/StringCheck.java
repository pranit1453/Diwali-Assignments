package com.demo.test;

import java.util.Scanner;

import com.demo.services.StringServices;
import com.demo.services.StringServicesImpl;

public class StringCheck {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringServices sservices = new StringServicesImpl();

		String ans = null;
		do {
			try {

				System.out.print("Enter a string to check if it is alphanumeric or not : ");
				String input = sc.next();

				boolean result = sservices.isAlphanumeric(input);
				if (result) {
					System.out.println("The string \"" + input + "\" is alphanumeric.");
				} else {
					System.out.println("The string \"" + input + "\" is NOT alphanumeric.");
				}
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
			System.out.println("String Alhpanumeric is checked");
			System.out.print("Do you want to check for another number? (y/n): ");
			ans = sc.next();
		} while (ans.equalsIgnoreCase("y"));

		sc.close();
		System.out.println("String Alphanumeric is successfully terminated....");

	}

}
