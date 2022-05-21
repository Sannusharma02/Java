package miniPrograms;
import java.util.Scanner;
public class Prime {

	public static void main(String[] args) 
	{	
		System.out.println("Enter the number: ");
		try (Scanner scr = new Scanner(System.in)) {
			int n=scr.nextInt();
			int a=1;
			if (n<2) 
			{
				System.out.println(n+" is not a Prime Number");
				return;
			}
			for (int i = 2; i < n; i++) 
			{
				if(n%i==0)
				{
					a=0;
					System.out.println(n+" is not a Prime Number");
					break;
				}
			}
			if (a==1) 
			{
				System.out.println(n+" is a Prime Number");
			}
		}
	}
}
