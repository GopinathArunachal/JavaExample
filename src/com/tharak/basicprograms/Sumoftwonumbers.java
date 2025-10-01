package com.tharak.basicprograms;

import java.util.Scanner;

public class Sumoftwonumbers {
	public Sumoftwonumbers() {

	}

	public static int add(int a, int b) {
		int c = a + b;
		return c;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt(), b = sc.nextInt();
		System.out.println(add(a, b));
		sc.close();
	}
}
