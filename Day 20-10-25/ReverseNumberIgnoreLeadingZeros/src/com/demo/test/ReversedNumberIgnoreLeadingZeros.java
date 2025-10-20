package com.demo.test;

import java.util.Scanner;

import com.demo.services.ReversedNumberService;
import com.demo.services.ReversedNumberServiceImpl;

public class ReversedNumberIgnoreLeadingZeros {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		ReversedNumberService rservice = new ReversedNumberServiceImpl();
		String ans = null;
		do {
			try {
				System.out.println("Enter number : ");
				int n = sc.nextInt();
				int res = rservice.generateReversedNumber(n);
				System.out.println("The normal number is " + n + " .");
				System.out.println("The reversed number is " + res + " .");
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
			System.out.println("Reversed Number is successfully checked....");
			System.out.print("Do you want to check for another number? (y/n) : ");
			ans = sc.next();
		} while (ans.equalsIgnoreCase("y"));

		sc.close();
		System.out.println("Reversed Number code is successfully terminated...");


	}

}
