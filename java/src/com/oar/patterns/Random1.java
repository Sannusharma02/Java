package com.oar.patterns;

public class Random1 {

	public static void main(String[] args) {
		for(int i=1;i<=5;i++)	
		{
			for(int j=1;j<=5;j++)
			{
				System.out.print("*");
				if(i%2==0)
					break;
			}
			System.out.println();
		}
	}
}