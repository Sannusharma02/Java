package com.oar.String;

public class ReverseOfEveryWord {

	public static void reversOfEveryWord(String s) {
		String s1=s.toLowerCase();
		String[] arrwords=s1.split(" ");
		String reverseString="";
		
		for(int i=0;i<arrwords.length;i++)
		{	
			String word=arrwords[i];
			String reverseWord="";
			for(int j=word.length()-1;j>=0;j--)
			{
				reverseWord=reverseWord+word.charAt(j);
			}
			reverseString =reverseString+reverseWord+" ";
		}
		System.out.println(reverseString);
	}
	public static void main(String[] args) {
		String s="An apple a day keeps the doctor away";
		reversOfEveryWord(s);
	}
}
