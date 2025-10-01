package com.tharak.basicprograms;

import java.util.Scanner;

public class LargestofTwoNumbers {

	public static int findlargestofTwoNumbers(int a ,int b) {
		return a > b? a:b;
		
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.err.println("The largest number is "+
				findlargestofTwoNumbers(sc.nextInt(), sc.nextInt()));
		sc.close();
	}
}
