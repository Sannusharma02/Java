package miniPrograms;
import java.util.Scanner;
public class BreakVsReturn 
{
	public static void main(String[] args) 
	{
		m1();
	}
	private static void m1() 
	{
		System.out.println("M1 Starts");
		System.out.println("enter the number");
		try (Scanner scr = new Scanner(System.in)) {
			int inp=scr.nextInt();
			for (int i = inp; i < 10; i++) 
			{
				System.out.println(i);
				if(i==3)
				{
					System.out.println("method is returned");
					return;
				}
				else if(i>=11)
				{
					System.out.println("break the loop");
					break;
				}
			}
		}
		System.out.println("M1 Ends ");
	}
}