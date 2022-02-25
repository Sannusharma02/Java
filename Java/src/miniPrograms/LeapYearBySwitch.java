package miniPrograms;

import java.util.Scanner;

public class LeapYearBySwitch 
{
	public static void main(String[] args) 
	{
		try (Scanner scr = new Scanner(System.in)) {
			System.out.println("Enter a day");
			int d = scr.nextInt();
			switch(d)
			{
			case 1: System.out.println("Sunday");
			break;
			case 2: System.out.println("Monday");
			break;
			case 3: System.out.println("Tuesday");
			break;
			case 4: System.out.println("Friday");
			break;
			case 5: System.out.println("Thursday");
			break;
			case 6: System.out.println("Friday");
			break;
			case 7: System.out.println("Saturday");
			break;
			default: System.out.println("Invalid Input");
			}
		}	
	}
}
