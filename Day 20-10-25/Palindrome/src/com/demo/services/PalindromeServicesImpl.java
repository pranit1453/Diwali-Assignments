package com.demo.services;

public class PalindromeServicesImpl implements PalindromeServices {

	@Override
	public boolean checkPalindrome(int n) {
		int originalNum = n;
		int rev = 0;
		while (n != 0) {
			int rem = n % 10; // it gives me remainder after each iteration.
			rev = rev * 10 + rem;
			n /= 10;  // it gives me quotient after each iteration.
		}
		return originalNum == rev;
	}

}
