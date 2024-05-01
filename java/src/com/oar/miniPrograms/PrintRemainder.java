package com.oar.miniPrograms;

import java.util.Scanner;

public class PrintRemainder {

	public static void main(String[] args) {
		try (Scanner scr = new Scanner(System.in)) {
			System.out.println("Enter the Dividend: ");
			int a=scr.nextInt();	
			System.out.println("enter the Divisor: ");
			int b=scr.nextInt();
			int c = a%b;
			System.out.println(c);
		}
	}

}
