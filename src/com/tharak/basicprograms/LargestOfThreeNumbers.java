package com.tharak.basicprograms;

import java.util.Scanner;

public class LargestOfThreeNumbers {

	public static int largestnumber(int[] numbers) {

		int largest = 0;
		for (int i = 0; i < numbers.length; i++) {

			largest = largest > numbers[i] ? largest : numbers[i];
		}

		return largest;
	}

	public static void main(String arg[]) {

		Scanner sc = new Scanner(System.in);
		int[] i = new int[] { sc.nextInt(), sc.nextInt(), sc.nextInt(), sc.nextInt() };
		System.err.println("The maxmimum nuber is " + largestnumber(i));
		sc.close();
	}
}
