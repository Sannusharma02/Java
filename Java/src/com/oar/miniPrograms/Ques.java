package com.oar.miniPrograms;

import java.util.Scanner;

public class Ques {
	public static void main(String...args) 
	{
		try (Scanner sc = new Scanner(System.in)) 
		{
			String str= sc.next();
			int count=0;
			for (int i = 0; i < str.length() - 1; i++)
			{
				if ((str.charAt(i) == ' ') && (str.charAt(i + 1) != ' '))
				{
					count++;
				}
			}
			System.out.println(+count);
		} 
	   
	  } 


}
