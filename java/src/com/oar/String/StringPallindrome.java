package com.oar.String;

public class StringPallindrome {

	public static void main(String[] args) {
		System.out.println(isPallindrome("Malayalam"));
	}
	
	static boolean isPallindrome(String str) {
		str = str.toLowerCase();
		
		int len=str.length();
		for(int i=0; i<len/2; i++) {
			if(str.charAt(i) != str.charAt(len-1-i)) return false;
		}
		return true;
	}
}
