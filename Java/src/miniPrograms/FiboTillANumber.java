package miniPrograms;

import java.util.Scanner;

public class FiboTillANumber 
{
	public static void main(String[] args) 
	{
		try (Scanner scr = new Scanner(System.in)) 
		{
			System.out.println("Enter the number: ");
			int n= scr.nextInt();
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
				System.out.println("Fibonacci series of "+n+"numbers are :"+a+" /n"+b );
				return;
			}
			System.out.println("Fibonacci series of "+n+"numbers are :"+a+" "+b);
			for ( ; ; ) 
			{
				c=a+b;
				if(c>n)
					break;
				System.out.println(" "+c);
				a=b;
				b=c;
			}
		}
	}
}