package com.oar.multithreading; 

class Abc implements Runnable
{
	public void run()
	{
		for(char ch='A'; ch<='Z'; ch++)
		{
			System.out.println(ch);
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
public class ThreadByImplementing 
{
	public static void main(String[] args) 
	{
		Runnable r=new Abc();
		Thread t=new Thread(r);
		t.start();
		Thread h=new Thread(r);
		h.start();
		
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
