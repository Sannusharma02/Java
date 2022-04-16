package multithreading;

class Husband extends Thread
{
	public void run()
	{
		Account2 h=Account2.getObject();
		h.deposite(1000);
	}
	
}

class Wife extends Thread
{
	public void run()
	{
		Account2 w=Account2.getObject();
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
		
		Account2 acc=Account2.getObject();
		acc.balanceCheck();
	}

}
