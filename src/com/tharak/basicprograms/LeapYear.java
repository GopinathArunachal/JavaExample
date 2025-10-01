package com.tharak.basicprograms;

import java.util.Scanner;

public class LeapYear {
public static String findLeapYear(int year) {
	int c=  year%4;
	System.out.println("The modulus "+c);
	return  c<=0?"Leap":"Normal";
}
public static void main(String arg[]) {
	Scanner scan = new Scanner(System.in);
	System.out.println(findLeapYear(scan.nextInt()));
	System.out.println(findLeapYear(scan.nextInt()));
	scan.close();
}
}