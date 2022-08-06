package com.oar.multithreading;

class X
{
	public synchronized void m1(int k)
	{
		print(k);
	}
	
	public void print(int num)
	{ 
		for(int i=num;i>0;i--)
		{
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(i);
		}
	}
}
class Thread1 extends Thread
{
	X d;
	Thread1(X t)
	{
		d=t;
	}
	public void run()
	{
		d.m1(100);
	}
}
class Thread2 extends Thread
{
	X q;
	Thread2(X t)
	{
		q=t;
	}
	public void run()
	{
		q.m1(100);
	}
}
public class Test {

	public static void main(String[] args) 
	{	
		X p= new X();
		X s= new X();
		
		Thread g= new Thread1(p);
		Thread r= new Thread2(s);
		
		g.start();
		r.start();
	}

}
