package com.demo.test;

import java.util.Scanner;

import com.demo.services.EvenOddService;
import com.demo.services.EvenOddServiceImpl;

public class EvenOddCheck {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		EvenOddService eoservice = new EvenOddServiceImpl();
		String ans;
		do {
			try {
				System.out.print("Enter number to check even or odd : ");
				int n = sc.nextInt();
				sc.nextLine();

				String res = eoservice.checkEvenOdd(n);
				if (!res.isEmpty()) {
					System.out.println("Number " + n + " is : " + res);
				} else {
					System.out.println("Something Went Wrong!!");
				}
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
			System.out.println("Even Odd Numbers Checked");
			System.out.print("Do you want to check another number? (y/n): ");
			ans = sc.next();

		} while (ans.equalsIgnoreCase("y"));

		sc.close();
		System.out.println("Even Odd number code is terminated.....");

	}

}
