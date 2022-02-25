package miniPrograms;

import java.util.Scanner;

public class DivisivleByN {

	public static void main(String[] args) {
		try (Scanner scr = new Scanner(System.in)) {
			System.out.println("Enter the Dividend: ");
			int a=scr.nextInt();
			System.out.println("enter the Divisor: ");
			int b=scr.nextInt();
			
			if(a%b==0)
				System.out.println(a+" is divisible by "+b);
			else
				System.out.println(a+" is not divisible by "+b);
		}
	}
}
