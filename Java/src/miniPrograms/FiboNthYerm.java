package miniPrograms;
import java.util.Scanner;
public class FiboNthYerm 
{
	public static void main(String[] args) 
	{
		try (Scanner scr = new Scanner(System.in)) 
		{
			int n=scr.nextInt();
			int a=0,b=1,c=0,count=2;
			if(n<=0)
			{
				System.out.println("Invalid Input");
				return;
			}
			if(n==1)
			{
				System.out.println("The "+n+"th term value is 0");
				return;
			}
			if(n==2)
			{
				System.out.println("The "+n+"th term value is 1");
				return;
			}
			for( ; ; )
			{
				c=a+b;
				count++;
				if(count==n)
				{
					System.out.println("The "+n+"th term value is "+c);
					break;
				}
				a=b;
				b=c;
			}
		}
	}
}