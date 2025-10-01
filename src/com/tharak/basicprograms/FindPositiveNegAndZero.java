
package com.tharak.basicprograms;

import java.util.Scanner;

public class FindPositiveNegAndZero {
	public static String findpositivenegative(int num1) {
		String numType ="";
		if(num1 == 0) numType="ZEro";
		else numType= num1 >0?"Positive":"negative";
		return numType;
	}
	public static void main(String[] arg) {
		Scanner scan = new Scanner(System.in);
		System.out.println(findpositivenegative(scan.nextInt()));
		System.out.println(findpositivenegative(scan.nextInt()));
		System.out.println(findpositivenegative(scan.nextInt()));
		System.out.println(findpositivenegative(scan.nextInt()));
		scan.close();
	}

}
