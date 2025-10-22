package com.demo.services;

public class GCDLCMServicesImpl implements GCDLCMServices {

	@Override
	public double calculateGCD(double n1, double n2) {
		while (n2 != 0) {
			double temp = n2;
			n2 = n1 % n2;
			n1 = temp;
		}
		return n1;
	}

	@Override
	public double calculateLCM(double n1, double n2) {
		double gcd = calculateGCD(n1, n2);
		double res = (n1 * n2) / gcd;
		return res;
	}

}
