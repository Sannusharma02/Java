package multithreading;

class User extends Thread
{
	public void run()
	{
		for(char ch='A';ch<='Z';ch++)
		{
			System.out.println(ch);
			try
			{
				Thread.sleep(300);
			}
			catch(InterruptedException e)
			{
				e.printStackTrace();
			}
		}
	}
}
public class ThreadByExtending 
{
	public static void main(String[] args) 
	{
		Thread t=new User();
		t.start();
		for(int i=1;i<=50;i++)
		{
			System.out.println(i);
			try
			{
				Thread.sleep(300);
			}
			catch(InterruptedException e)
			{
				e.printStackTrace();
			}
		}
	}
}
