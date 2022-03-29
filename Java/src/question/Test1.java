package question;

import question8.A;

class A {
	class A1 {
	void printValue(){
	System.out.println("A.A1");
	}
	}
	}

public class Test1{
public static void main (String[] args){
 A a = new A();
 A.A1 a1 = a.new A1();
 a1.printValue();
 }
 }
