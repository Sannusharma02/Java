package com.question.question1;

public class Foo {
	static void alpha()
	{	
	}
	void beta()
	{	
		alpha();
	}

	public static void main(String[] args) 
	{
		Foo.alpha();
		new Foo().beta();
		
		
	}
}