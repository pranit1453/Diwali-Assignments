package com.demo.services;

public class PatternServicesImpl implements PatternServices {

	@Override
	public void patternTriangle(int n) {
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(j + " ");
			}
			System.out.println();
		}

	}

	@Override
	public void patternPyramid(int n) {
		for (int i = 1; i <= n; i++) {
			// Print spaces
			for (int j = 1; j <= n - i; j++) {
				System.out.print(" ");
			}
			// Print numbers
			for (int k = 1; k <= i; k++) {
				System.out.print(k + " ");
			}
			System.out.println();
		}
	}

}
