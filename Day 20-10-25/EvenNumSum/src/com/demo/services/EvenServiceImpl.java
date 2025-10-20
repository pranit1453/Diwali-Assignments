package com.demo.services;

public class EvenServiceImpl implements EvenService {

	@Override
	public int sumOfEvenNumber(int n) {
		int sum = 0;
		for (int i = 1; i <= n; i++) {
				sum += 2 * i;
		}
		return sum;

	}

}
