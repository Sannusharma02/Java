package com.oar.String;
public class Demo2 {
	public static void main(String[] args) {
		String str = "JavaDev";
		StringBuilder sb =new StringBuilder();
		for(int i =0; i<str.length(); i++) {
			char c=str.charAt(i);
			
			if(c>='A' && c<='Z')
				sb.append(Character.toLowerCase(c)) ;
			else
				sb.append(Character.toUpperCase(c)) ;
		}
		String res = sb.toString();
		System.out.println(res);
	}
}