package miniPrograms;

import java.util.Scanner;

public class NoOfDaysInMonthOfTheYear {

	public static void main(String[] args) {
		try (Scanner scr = new Scanner(System.in)) 
		{
			System.out.println("enter the month:");
			int mm=scr.nextInt();
			System.out.println("enter the year:");
			int yyyy=scr.nextInt();
			
			switch(mm) {
			case 1:
			case 3:
			case 5:
			case 7:
			case 8:
			case 10:
			case 12: System.out.println("theirs are 31 days in "+mm+" month of the year "+yyyy);
			break;
			
			case 4:
			case 6:
			case 9:
			case 11: System.out.println("theirs are 30 days in "+mm+" month of the year "+yyyy);
			break;
				
			case 2: if(yyyy%400==0||yyyy%4==0&&yyyy%100!=0)
				System.out.println("It has 29 days in "+mm+" month of the year "+yyyy+" and it is a leap year");
			else
				System.out.println("theirs are 28 days in "+mm+" month of the year "+yyyy+" and it is not a leap year");
			break;
			
			default :System.out.println("invalid input");
			}
		}
	}

}
