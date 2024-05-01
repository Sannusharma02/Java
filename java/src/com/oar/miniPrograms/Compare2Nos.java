package com.oar.miniPrograms;

import java.util.Scanner;

public class Compare2Nos {

	public static void main(String[] args) {
		try (Scanner scr = new Scanner(System.in)) {
			System.out.println("Enter the first interger: ");
			int a=scr.nextInt();
			System.out.println("Enter the Second interger: ");
			int b=scr.nextInt();
			if(a>b)
				System.out.println(a+" is greater than "+b);
			else if(b>a)
				System.out.println(b+" is greater than "+a);
			else
				System.out.println(a+" = "+b);
		}
	}
}
