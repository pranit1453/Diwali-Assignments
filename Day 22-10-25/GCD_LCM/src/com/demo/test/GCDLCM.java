package com.demo.test;

import java.util.Scanner;

import com.demo.services.GCDLCMServices;
import com.demo.services.GCDLCMServicesImpl;

public class GCDLCM {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		GCDLCMServices glservices = new GCDLCMServicesImpl();

		String ans = null;
		do {
			try {
				System.out.print("Enter First Number: ");
				double n1 = sc.nextDouble();
				System.out.print("Enter Second Number: ");
				double n2 = sc.nextDouble();
				double gcd = glservices.calculateGCD(n1, n2);
				double lcm = glservices.calculateLCM(n1, n2);
				System.out.println("GCD of two numbers " + n1 + " , " + n2 + " is : " + gcd);
				System.out.println("LCM of two numbers " + n1 + " , " + n2 + " is : " + lcm);
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
			System.out.println("GCD&LCM of two numbers is done");
			System.out.print("Do you want to check for another number? (y/n): ");
			ans = sc.next();
		} while (ans.equalsIgnoreCase("y"));

		sc.close();
		System.out.println("GCD&LCM of two number is successfully terminated....");

	}

}
