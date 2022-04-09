package com.question.question4;

public class Question4 {
	
//	static final int[] a = { 100,200 };
	
//	static final int[] a;
//	static { a=new int[2]; a[0]=100; a[1]=200; }
	
//	static final int[] a = new int[2]{ 100,200 };
	
//	static final int[] a;
//	static void init() { a = new int[3]; a[0]=100; a[1]=200; }
	
	public static void logIt(String... msgs)
	{	
		for(int i=0;i<msgs.length;i++) 
		{
			System.out.println(msgs[i]);
		}
	}
	public static void main(String[] args) 
	{
		logIt("log message1");
		logIt("log message2","log message3");
		logIt("log message4","log message5","log message6");
	}
}