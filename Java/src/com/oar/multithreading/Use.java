package com.oar.multithreading;


class Customer implements Runnable
{
	int items;

	Customer(int items)
	{
		this.items=items;
	}
	
	public void run()
	{
		GoDown t= GoDown.getOb();
		t.purchase(items);
	}
}

class Manufacturer implements Runnable
{
	int upitems;
	
	Manufacturer(int upitems)
	{
		this.upitems=upitems;
	}
	
	public void run()
	{
		GoDown p= GoDown.getOb();
		p.update(upitems);
	}
}

	public class Use {

	public static void main(String[] args) {
		Runnable r1=new Customer(70);
		Thread cu1=new Thread(r1);
		cu1.start();
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		Runnable r2=new Customer(60);
		Thread cu2=new Thread(r2);
		cu2.start();
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		Runnable m1= new Manufacturer(100);
		Thread manu1=new Thread(m1);
		manu1.start();
	}

}
