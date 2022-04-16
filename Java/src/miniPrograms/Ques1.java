package miniPrograms;

import java.util.Scanner;

public class Ques1 {
	public static void main(String[] args) 
	{
		int count=0;
		try (Scanner src = new Scanner(System.in)) 
		{	
			while(count<3) 
			{
				System.out.println("Please enter a valid 10 digit number: ");
				String s=src.nextLine(); 
				count++;
				if(s.matches("[0-9]{10}")) 
				{
					System.out.println("Thank you"); 
					count=3;
				}
				else
				{
					System.out.println("try again");
				}
			}
			count++;
			if(count>4)
			{
				System.err.println("Sorry. All your tries are over. Please try later");
			}
		}
	}
}
