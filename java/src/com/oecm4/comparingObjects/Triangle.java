package com.oecm4.comparingObjects;

public class Triangle {

	int base;
	int height;
	
	public Triangle(int base, int height) {
		this.base = base;
		this.height = height;
	}
	
	@Override
	public boolean equals(Object o) {
		Triangle triangle =(Triangle)o;
		return base==triangle.base && height==triangle.height;
	}
	
	
	public static void main(String[] args) {
		Triangle t1 = new Triangle(10,20);
		Triangle t2 = new Triangle(10,20);
		System.out.println(t1);
		System.out.println(t2);
		
		System.out.println(t1.equals(t2));
	}

}
