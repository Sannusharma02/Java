package com.oar.multithreading;

public class Account2 
{
	double balance=5000;
	static Account2 account;
	
	private Account2()
	{}
	
	public static Account2 getObject()
	{
		if(account==null)
		{
			account=new Account2();
		}
		return account;
	}
	
	public void deposite(double amt)
	{
		System.out.println("Your deposite initiated");
		System.out.println("You are depositing = "+amt);
		System.out.println("Current balance is = "+balance);
		synchronized (this)
		{
			double curbal=balance;
			curbal+=amt;
			try
			{
				Thread.sleep(200);
			}
			catch(InterruptedException e)
			{
				e.printStackTrace();
			}	
			balance=curbal;
		}
		System.out.println("After depositing your amount balance is = "+balance);
	}
	
	public void withdraw(double amt)
	{
		if (amt>balance)
		{
				System.out.println("Insufficient balance");
				return;
		}
		else
			balance=balance-amt;
	}
	
	public void balanceCheck()
	{ 
		System.out.println("Current balance "+balance);
	}
}
