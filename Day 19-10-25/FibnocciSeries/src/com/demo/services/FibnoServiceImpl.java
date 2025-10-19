package com.demo.services;

import java.util.ArrayList;
import java.util.List;

public class FibnoServiceImpl implements FibnoService {

	@Override
	public List<Integer> generateFibonacciSeries(int n) {

		List<Integer> flist = new ArrayList<>();

		if (n <= 0) {
			return flist;
		}
		int a = 0;
		int b = 1;
		for (int i = 0; i < n; i++) {
			flist.add(a);
			int next = a + b;
			a = b;
			b = next;
		}
		return flist;
	}

}
