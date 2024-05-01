package com.oar.multithreading;

public class Account 
{
	double balance=5000;
	static Account account;
	
	private Account()
	{}
	
	public static Account getObject()
	{
		if(account==null)
		{
			account=new Account();
		}
		return account;
	}
	
	synchronized public void deposite(double amt)
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
