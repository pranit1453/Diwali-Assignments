package com.demo.test;

import java.util.Scanner;

import com.demo.services.PalindromeServices;
import com.demo.services.PalindromeServicesImpl;

public class CheckPalindrome {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		PalindromeServices pservice = new PalindromeServicesImpl();
		String ans = null;
		do {
			try {
				System.out.println("Enter number : ");
				int n = sc.nextInt();
				boolean status = pservice.checkPalindrome(n);
				if (status) {
					System.out.println("The number " + n + " is a Palindrome Number.");
				} else {
					System.out.println("The number " + n + " is not a Palindrome Number.");
				}
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
			System.out.println("Palindrome Number is successfully checked....");
			System.out.print("Do you want to check for another number? (y/n) : ");
			ans = sc.next();
		} while (ans.equalsIgnoreCase("y"));

		sc.close();
		System.out.println("Palindrome Number code is successfully terminated...");

	}

}
