package com.tharak.basicprograms;

import java.util.Scanner;

public class EvenOrOdd {
	public static String checkEvenOrOdd(int a) {
		return a % 2 == 0 ? "Even" : "Odd";
	}
	public static int getmodulus(int a,int b) {
		return a%2;
	}

	public static void main(String[] arg) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		System.out.println("The given value is " + checkEvenOrOdd(a));
		int b=sc.nextInt();		
		System.out.println("The modulus  is "+getmodulus(a, b));
		sc.close();
	}
}
