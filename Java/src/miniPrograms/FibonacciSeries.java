package miniPrograms;

import java.util.Scanner;
public class FibonacciSeries 
{
	public static void main(String[] args) 
	{
		try (Scanner scr = new Scanner(System.in)) 
		{
			System.out.println("Enter a number:");
			int n=scr.nextInt();
			int a=0, b=1, c=0;
			if(n<0)
			{
				System.out.println("Invalid Input");
				return;
			}
			if(n==0)
			{
				System.out.println("0");
				return;
			}
			if(n==1)
			{
				System.out.println("Fibonacci series of "+n+"numbers are :"+a+" "+b );
				return;
			}
			System.out.print("Fibonacci series of "+n+"numbers are :"+a+" "+b);
			for (int i = 0; i < n-2; i++) {
				c=a+b;
				System.out.print(" "+c);
				a=b;
				b=c;
			}
		}
	}
}