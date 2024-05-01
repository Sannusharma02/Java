package com.oar.multithreading;

class User extends Thread
{
	public void run()
	{
		Thread g= Thread.currentThread();
//		Thread g=this;
		
		for(char ch='A';ch<='Z';ch++)
		{
			System.out.println(g.getName()+" is printing = "+ch);
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
		t.setName("Santa");
		t.setPriority(9);
		t.start();
		
		t=new User();
		t.setName("Banta");
		t.setPriority(3);
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
