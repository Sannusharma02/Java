package com.oar.userInput;

import java.util.Scanner;

public class Add2Nos {

	public static void main(String[] args) {
		try (Scanner scr = new Scanner(System.in)) {
			System.out.println("enter the first number");
			int a=scr.nextInt();
			System.out.println("enter the second number");
			int b=scr.nextInt();
			int c=a+b;
			System.err.println("the sum of "+a+" & "+b+" is "+c);
		}
	}
}
