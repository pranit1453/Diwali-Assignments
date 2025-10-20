package com.demo.test;

import java.util.Scanner;

import com.demo.services.ArmstrongServices;
import com.demo.services.ArmstrongServicesImpl;

public class checkArmstongNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		ArmstrongServices aservice = new ArmstrongServicesImpl();
		String ans = null;
		do {
			try {
				System.out.println("Enter number : ");
				int n = sc.nextInt();
				boolean status = aservice.checkArmstrong(n);
				if (status) {
					System.out.println("The number " + n + " is a Armstrong Number.");
				} else {
					System.out.println("The number " + n + " is not a Armstrong Number.");
				}
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
			System.out.println("Armstrong Number is successfully checked....");
			System.out.print("Do you want to check for another number? (y/n) : ");
			ans = sc.next();
		} while (ans.equalsIgnoreCase("y"));

		sc.close();
		System.out.println("Armstrong Number code is successfully terminated...");

	}

}
