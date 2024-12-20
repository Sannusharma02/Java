package com.oar.String;

public class CountOccurance {

	public static void main(String[] args) {
		
		String s = "java";
		System.out.println(s.replace('a', 'b'));
		System.out.println(s.replace('v',  'b'));
		
		String s1 = s.replace("a", "");
		int count = s.length()-s1.length();
		System.out.println(count);
	}

}
