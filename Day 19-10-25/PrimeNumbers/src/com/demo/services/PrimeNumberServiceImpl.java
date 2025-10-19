package com.demo.services;


import java.util.Set;
import java.util.TreeSet;

public class PrimeNumberServiceImpl implements PrimeNumberService {

	@Override
	public Set<Integer> generateAllPrimeNumber(int n) {
		// to store values in sorted manner we make use of tree set.
		Set<Integer> pset = new TreeSet<>();
		for (int i = 2; i <= n; i++) {
			boolean isPrime = true;

			for (int j = 2; j * j <= i; j++) {

				if (i % j == 0) {
					isPrime = false;
					break;
				}
			}
			if (isPrime) {
				pset.add(i);
			}
		}
		return pset;
	}

}
