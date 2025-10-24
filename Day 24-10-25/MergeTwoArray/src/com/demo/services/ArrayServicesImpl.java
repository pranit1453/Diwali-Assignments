package com.demo.services;

public class ArrayServicesImpl implements ArrayServices {

	@Override
	public int[] mergeArray(int[] num1, int[] num2) {
		int[] result = new int[num1.length + num2.length];
		int i = 0;
		int j = 0;
		int k = 0;
		while (i < num1.length && j < num2.length) {
			if (num1[i] <= num2[j]) {
				result[k++] = num1[i++];
			} else {
				result[k++] = num2[j++];
			}
		}

		while (i < num1.length) {
			result[k++] = num1[i++];
		}
		while (j < num2.length) {
			result[k++] = num2[j++];
		}
		return result;
	}

}
