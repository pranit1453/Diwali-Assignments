package com.demo.services;

public class ArmstrongServicesImpl implements ArmstrongServices {

	@Override
	public boolean checkArmstrong(int n) {

		int originalNum = n;
		int cnt = 0;

		int tempNum = n;
		// it will give the numbers of digits
		while (tempNum != 0) {
			cnt++;
			tempNum /= 10;
		}

		int sum = 0;
		tempNum = n;
		// it will calculate the sum of rem raised to cnt.
		while (tempNum != 0) {
			int rem = tempNum % 10;
			sum += Math.pow(rem, cnt);
			tempNum /= 10;
		}
		return originalNum == sum;
	}

}
