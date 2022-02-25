package miniPrograms;

import java.util.Scanner;

public class Factorial {  
	public static void main(String[] args) { 
		try (Scanner scr = new Scanner(System.in)) {
			System.out.println("Enter a number:");
			int n = scr.nextInt();
			int fact=1;
			for (int i = 1; i <=n; i++) {
				fact*=i;				
			}
			System.out.println("the factorial of "+n+" = "+fact);
		}
	}   
} 