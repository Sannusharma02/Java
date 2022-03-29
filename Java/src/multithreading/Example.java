package multithreading;

class Husband extends Thread
{
	public void run()
	{
		Account h=Account.getObject();
		h.deposite(1000);
	}
	
}

class Wife extends Thread
{
	public void run()
	{
		Account w=Account.getObject();
		w.deposite(1000);
	}
}

public class Example 
{
	public static void main(String[] args) 
	{
		Thread tH=new Husband();
		Thread tW=new Wife();
		
		tH.start();
		tW.start();
		
		try
		{
			Thread.sleep(500);
		}
		catch(InterruptedException e)
		{
			e.printStackTrace();
		}
		
		Account acc=Account.getObject();
		acc.balanceCheck();
	}

}
