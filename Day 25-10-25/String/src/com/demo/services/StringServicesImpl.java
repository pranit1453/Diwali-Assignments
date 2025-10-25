package com.demo.services;

public class StringServicesImpl implements StringServices {

//	@Override
//	// using Regex Expression
//	public boolean isAlphanumeric(String input) {
//		return input != null && input.matches("[A-Za-z0-9]+");
//	}

	// using For Loop
	public boolean isAlphanumeric(String input) {
		if (input == null || input.isEmpty()) {
			return false;
		}

		for (char ch : input.toCharArray()) {
			if (!Character.isLetterOrDigit(ch)) {
				return false;
			}
		}
		return true;
	}

}
