package multithreading;
class Jsp extends Thread
{
	public void run()
	{
		String n = Thread.currentThread().getName();
		for(int i=1;i<=50;i++) 
		{
			try 
			{
				Thread.sleep(200);
			} 
			catch (InterruptedException e) 
			{
				e.printStackTrace();
			}	
// 			if(i==10) 
//			{
//				int c=10/0;
//			 }
			System.out.println(n+i);
		}
	}
}

class Jsp2 extends Thread
{
	Thread d;
	Jsp2(Thread p)
	{
		d=p;
	}
	public void run()
	{
		String m = Thread.currentThread().getName();
		for(int i=1;i<=50;i++) 
		{
			if(i==10) {
				try {
					d.join();// q threads paused
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			try {
				Thread.sleep(200);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}	
			System.out.println(m+i);
		}
	}
}

public class Example5 {

	public static void main(String[] args) {
		Thread p= new Jsp();
		Thread q= new Jsp2(p);
		p.setName("P Thread");
		q.setName("Q thread");
		
		p.start();
		q.start();
//		try {
//			p.join();// main thread pauses and jsp thread starts
//			q.join();
//		} catch (InterruptedException e1) {
//			// TODO Auto-generated catch block
//			e1.printStackTrace();
//		}
		for(char i='a';i<='z';i++) 
		{
		try {
			Thread.sleep(200);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}	
		System.out.println(i);
		}
	}
}
