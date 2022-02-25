package miniPrograms;
import java.util.Scanner;
public class LeapYear 
{
	public static void main(String[] args) 
	{
		try (Scanner scr = new Scanner(System.in)) 
		{
			System.out.println("Enter the year");
			int a=scr.nextInt();
			System.out.println();
			if(a%400==0 ||a%4==0 && a%100!=0)
				System.out.println(a+" is a leap year");
			else
				System.out.println(a+" is not a leap year");
		}
	}
}