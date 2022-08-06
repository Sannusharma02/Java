package com.oar.userInput;
import java.util.Scanner;

public class UserInput {

	public static void main(String[] args) {
		
		try (Scanner scr = new Scanner(System.in)) {
			System.out.print("enter a number: ");
			int n=scr.nextInt();
			System.out.println("The entered number is : "+n);
			
			System.out.print("enter a string: ");
			String s=scr.next();
			System.out.println("The entered string is : "+s);
			
			System.out.print("enter an decimal number: ");
			Double d=scr.nextDouble();
			System.out.println("The entered number is : "+d);
			
		}
	}

}
