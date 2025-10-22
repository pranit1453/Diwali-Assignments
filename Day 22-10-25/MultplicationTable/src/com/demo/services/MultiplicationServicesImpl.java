package com.demo.services;

public class MultiplicationServicesImpl implements MultiplicationServices {

	@Override
	public double MultiplicationTable(double n) {
		for (int i = 1; i <= 10; i++) {
			double res = n * i;
			System.out.println(n + " * " + i + " : " + res);
		}
		return 0;
	}

}
