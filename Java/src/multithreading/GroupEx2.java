package multithreading;

class Airport extends Thread
{
	public void run()
	{
		for(int i=1;i<=10;i++)
		{
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println();
		}
	}
}

public class GroupEx2 {

	public static void main(String[] args) {
		ThreadGroup tg = new ThreadGroup("OAR");
		
		
	}

}
