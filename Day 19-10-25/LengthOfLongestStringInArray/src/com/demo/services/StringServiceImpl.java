package com.demo.services;

public class StringServiceImpl implements StringService {

	@Override
	public int longestStringInArray(String[] arr) {

		int maxLen = 0;

		for (String str : arr) {
			if (str.length() > maxLen) {
				maxLen = str.length();
			}
		}

		return maxLen;
	}

}
