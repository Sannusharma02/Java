package miniPrograms;
import java.util.Scanner;
public class PrimeNestedLoop 
{
	public static void main(String[] args) 
	{
		try (Scanner scr = new Scanner(System.in)) 
		{
			System.out.println("Enter the number");
			int n =scr.nextInt();
			for(int i=1; i<=n; i++)
			{
				if (i==1) 
					continue;
				int flag=1;
				for (int j = 2; j <=i/2; j++) 
				{
					if(i%j==0)
					{
						flag=0;
						break;
					}
				}
				if(flag==1)
					System.out.println(i);
			}
		}
	}
}
