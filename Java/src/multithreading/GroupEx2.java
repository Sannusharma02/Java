package multithreading;
class Airport extends Thread
{
	Airport(ThreadGroup t,String str)
	{
		super(t, str);
	}
	public void run()
	{
		for(int i=1;i<=10;i++)
		{
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) { 
				e.printStackTrace();
			}
			System.out.println(Thread.currentThread().getName()+" Airport "+Thread.currentThread().getThreadGroup().getName());
		}
	}
}

class Railway implements Runnable
{
	public void run()
	{
		for(int i=1;i<=10;i++)
		{
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(Thread.currentThread().getName()+" train "+Thread.currentThread().getThreadGroup().getName());
		}
	}
}

public class GroupEx2 {

	public static void main(String[] args) {
		
		ThreadGroup tg1 = new ThreadGroup("Old Airport Branch");
		ThreadGroup tg2 = new ThreadGroup("New Airport Branch");
		tg1.setMaxPriority(4);
		
		Thread t1=new Airport(tg1 , "flight 1");
		Thread t2=new Airport(tg2 , "flight 2");
//		tg1.setMaxPriority(4);threads above this wont be affected but after would be affected
		t1.start();
		t2.start();
		
		Runnable w =new  Railway();
		Thread r1 = new Thread(tg1,w,"Train 1");
		r1.setPriority(2);
		Thread r2 = new Thread(tg2,w,"Train 2");
		r1.start();
		r2.start();
		
		tg1.list();
		tg2.list();
		
		System.out.println(tg1.getMaxPriority());
		System.out.println(tg1.activeCount());
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
//		tg1.suspend();
//		try {
//			Thread.sleep(500);
//		} catch (InterruptedException e) {
//			e.printStackTrace();
//		}
//		tg1.resume();
		
//		tg1.stop();
		
		System.out.println( );
		
	}
}