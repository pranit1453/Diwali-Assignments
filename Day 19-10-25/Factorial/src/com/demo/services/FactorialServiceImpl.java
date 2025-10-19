package com.demo.services;

public class FactorialServiceImpl implements FactorailService {

	@Override
	public long generateFactorail(int n) {
		if (n < 0) {
			throw new IllegalArgumentException("Factorial not defined for negative numbers");
		}
		long fact = 1;
		for (int i = 2; i <= n; i++) {
			fact *= i;
		}
		return fact;
	}

}
