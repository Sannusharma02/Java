package com.oar.multithreading;

class Boyfriend extends Thread
{
	public void run()
	{
		String str=Thread.currentThread().getName();
		for(int i=1;i<=30;i++)
		{
			try {
				Thread.sleep(200);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(str+" is saying please wait");
		}
	}
}

class Girlfriend extends Thread
{
	Thread boy;
	public Girlfriend(Thread boy) {
		this.boy=boy;
	}

	public void run()
	{
		String str1=Thread.currentThread().getName();
		
		for(int i=1;i<=30;i++)
		{
			try {
				Thread.sleep(200);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			if(i==10)
			{
				try {
					boy.join(1000);
				} catch (InterruptedException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
			}
			System.out.println(str1+" saying please come");
		}
	}
}

public class JoinExample 
{
	public static void main(String[] args) 
	{
		Thread boy= new Boyfriend();
		Thread girl = new Girlfriend(boy);
		
		boy.setName("Boy Thread");
		girl.setName("Girl Thread");
		
		boy.start();
		girl.start();
	}
}
