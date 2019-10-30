package com.varsha.manju;

public class RemoveCharFromString {
	
	//Given a string, return a version without the first 
	//2 chars. Except keep the first char if it is ‘a’ and keep 
	//the second char if it is ‘b’.

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(removeChars("absolute"));
System.out.println(removeChars("Ant"));
System.out.println(removeChars("base"));
System.out.println(removeChars("ubiquitous"));
	}
	
	public static String removeChars(String s){
		
		s = s.toLowerCase();
		String firstChar = (s.length()>0 && s.charAt(0)== 'a')? "a" : "";
		
		String secondChar = (s.length()>1 && s.charAt(1)== 'b')?"b" : "";
		
		String remaining = s.length()>2 ? s.substring(2):"";
		
		return firstChar + secondChar + remaining;
	}

}
