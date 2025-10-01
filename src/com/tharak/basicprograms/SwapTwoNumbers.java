package com.tharak.basicprograms;

public class SwapTwoNumbers {

	public static void swapNumbers(int a,int b) {
		//Swap with third variables
		int temp = a;a= b ;b=temp;
		System.out.println("The values a "+a+ " b is "+b);
		//Swap without third variables
		a= 25;
		b= 45;
		a^=b;
		b^=a;
		a^=b;
		System.out.println("The values a "+a+ " b is "+b);
	}
public static void main(String arg[]) {
	swapNumbers(10, 20);
}
}
 
