package miniPrograms;
import java.util.Scanner;
public class FiboRange 
{
	public static void main(String[] args) 
	{
		try (Scanner scr = new Scanner(System.in)) 
		{
			System.out.println("Enter the range:");
			int m=scr.nextInt();
			int n=scr.nextInt();
			System.out.println("the numbers betwwen "+m+ "and "+n );
			int a=0,b=1,c=0;
			
			for( ; ; )
			{
				c=a+b;
				if(c>m)
					break;
				c=m;
				if(c<=n)
				{
					System.out.println(" "+c);
					a=b;
					b=c;
				}
			}
		}
	}
}