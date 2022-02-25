package miniPrograms;

import java.util.Scanner;

public class SumOfN {

	public static void main(String[] args) {
		try (Scanner scr = new Scanner(System.in)) {
			System.out.println("Enter the natural number: ");
			int n=scr.nextInt();
			int sum=0;
			for (int i = 1;i <=n; i++) {
				sum=sum+i;	
			}
			System.out.println("Sum of 1-"+n+" is "+sum);
		}
	}
}