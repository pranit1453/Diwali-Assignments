package com.demo.services;

public class ReversedNumberServiceImpl implements ReversedNumberService {

	@Override
	public int generateReversedNumber(int n) {
		int rev = 0;
		while (n != 0) {
			int rem = n % 10;
			rev = rev * 10 + rem;
			n /= 10;
		}
		return rev;
	}

}
