package com.oecm4.string;

public class StringPallindrome {

	public static void main(String[] args) {
		System.out.println(isPallindrome("Malyalam"));
	}

	static boolean isPallindrome(String string) {
		string = string.toLowerCase();
		int len = string.length();
		for (int i = 0; i < len / 2; i++) {
			if (string.charAt(i) != string.charAt(len - 1 - i))
				return false;
		}
		return true;
	}
}
