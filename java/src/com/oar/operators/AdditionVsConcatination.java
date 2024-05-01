package com.oar.operators;

public class AdditionVsConcatination {

	public static void main(String[] args) {
		System.out.println(1+2+3);
		System.out.println(1+"2"+3);
		System.out.println(1+2+"3");
		System.out.println(1+"2"+"3");
		System.out.println("1"+2+"3");
		System.out.println("1"+"2"+"3");
	}

}
