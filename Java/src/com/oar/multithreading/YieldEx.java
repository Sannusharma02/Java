package com.oar.multithreading;

class Oar extends Thread
{
	public void run()
	{
		String str=Thread.currentThread().getName();
		
		for(int i=1;i<=10;i++)
		{
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			if(i==4)
			{
				Thread.yield();
			}
			System.out.println(str+" is executing "+i);
		}
	}
}

public class YieldEx {

	public static void main(String[] args) {
		Thread t1 = new Oar();
		Thread t2 = new Oar();
		Thread t3 = new Oar();
		
		t1.setName("1");
		t2.setName("2");
		t3.setName("3");
		t1.setPriority(2);
		t2.setPriority(10);
		t3.setPriority(5);
		t1.start();
		t3.start();
		try {
			Thread.sleep(5);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		t2.start();
		

	}

}
