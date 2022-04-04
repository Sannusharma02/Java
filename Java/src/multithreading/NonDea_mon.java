package multithreading;

class User1 extends Thread
{
	public void run()
	{
		Thread g= Thread.currentThread();
//		Thread g=this;
		
		while (true) 
		{
			System.out.println(g.getName()+" is running");
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
public class NonDea_mon {

	public static void main(String[] args) {
		{
			Thread t=new User1();
			t.setName("Non Deamon is running");
			t.setDaemon(true);   //it becomes deamon
			
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

}
