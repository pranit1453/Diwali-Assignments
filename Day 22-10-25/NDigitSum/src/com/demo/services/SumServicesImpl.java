package com.demo.services;

public class SumServicesImpl implements SumServices {

	@Override
	public double sumOfnDigit(double n) {
		double sum = 0;
		for (int i = 1; i <= n; i++) {
			sum += i;
		}
		return sum;
	}

}
