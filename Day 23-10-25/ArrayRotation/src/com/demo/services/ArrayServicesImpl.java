package com.demo.services;

public class ArrayServicesImpl implements ArrayServices {

	@Override
	public int[] rotate(int[] arr, int k) {
		int n = arr.length;
		if (n == 0)
			return arr;

		k = k % n; // handles k > n
		if (k == 0) {
			return arr;
		}

		reverse(arr, 0, n - 1); // reverse whole array
		reverse(arr, 0, k - 1); // reverse first k element
		reverse(arr, k, n - 1); // reverse remaining elements
		return arr;
	}

	private void reverse(int[] arr, int start, int end) {
		while (start < end) {
			int temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;
			start++;
			end--;
		}

	}

}
