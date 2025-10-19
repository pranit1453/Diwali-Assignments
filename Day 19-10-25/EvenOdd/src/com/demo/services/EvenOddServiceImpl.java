package com.demo.services;

public class EvenOddServiceImpl implements EvenOddService {

	@Override
	public String checkEvenOdd(int n) {

		if (n % 2 == 0) {
			return "Even";
		} else {
			return "Odd";
		}

	}

}
