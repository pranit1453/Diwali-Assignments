package com.demo.services;

public class OddServiceImpl implements OddService {

	@Override
	public int sumOfOddNumber(int n) {
		int sum = 0;
		for (int i = 1; i <= n; i++) {
			sum += (2 * i) - 1;
		}
		return sum;

	}

}
