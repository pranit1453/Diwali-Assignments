package com.demo.services;

public class PrimeNumberServiceImpl implements PrimeNumberService {

	@Override
	public boolean validatePrimeNumber(int n) {
		boolean isPrime = true;
		if (n < 0) {
			return false;
		} else if ((n == 0) || (n == 1)) {
			return false;
		}
		// note -----> it will check till the √n
		for (int i = 2; i * i <= n; i++) {
			if (n % i == 0) {
				isPrime = false;
				break;
			}
		}
		return isPrime;
	}

}
