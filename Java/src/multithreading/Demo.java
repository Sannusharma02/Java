package multithreading;
class Increment
{
	int i;
	synchronized public void increase()
	{
		i++;
	}
}

class First extends Thread
{
	Increment p;
	First(Increment k) {
		p=k;
	}
	public void run()
	{
		for(int i=1;i<=1000;i++)
			p.increase();
		System.out.println("First Completed");
	}
}

class Second extends Thread
{
	Increment g;
	Second(Increment k) {
		g=k;
	}
	public void run()
	{
		for(int i=1;i<=1000;i++)
			g.increase();
		System.out.println("Second Completed");
	}
}

public class Demo 
{
	public static void main(String[] args) 
	{
		Increment h=new Increment(); 
		Thread l = new First(h);
		Thread l1 = new First(h);
		Thread l2 = new First(h);
		Thread l3 = new First(h);
		Thread t = new Second(h);
		Thread t1 = new Second(h);
		Thread t2 = new Second(h);
		Thread t3 = new Second(h);
		l.start();
		l1.start();
		l2.start();
		l3.start();
		t.start();
		t1.start();
		t2.start();
		t3.start();
		
		try {
			Thread.sleep(25000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("i value = "+h.i);
	}
}
