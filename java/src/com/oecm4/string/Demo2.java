package com.oecm4.string;

public class Demo2 {

	public static void main(String[] args) {
//		StringBuilder stringBuilder = new StringBuilder("ABCD");
//		String string = stringBuilder.toString().toLowerCase();
//		System.out.println(string);

		String string = "JavaDev";
		StringBuilder stringBuilder = new StringBuilder();
		for (int i = 0; i < string.length(); i++) {
			char c = string.charAt(i);
			if (c >= 'A' && c <= 'Z')
				stringBuilder.append(Character.toLowerCase(c));
			else
				stringBuilder.append(Character.toUpperCase(c));
		}
		String resString = stringBuilder.toString();
		System.out.println(resString);
	}
}