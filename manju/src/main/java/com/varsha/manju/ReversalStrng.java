package com.varsha.manju;

public class ReversalStrng {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//System.out.println(reverseStr("big one"));
		//System.out.println(reverseStr(""));
System.out.println(reverseIteration("big one"));
System.out.println(reverseIteration(""));
		
	}
public static String reverseStr(String s){
	
	if(s == null || s.length() == 0){
		return s;
	}
	
	return new StringBuilder(s).reverse().toString();
}

//recursion

public static String reverseRecursion(String s1){
	if(s1 == null || s1.length()<=1){
		return s1;
	}
/*
 * Regular recursive function (aka head recursion) demonstrated above grows the size of the call stack. Each time the function calls itself, another entry has to be pushed onto the stack. The thing the function has to do before returning is add count with the result of countA(input.substring(1), assuming count is greater than 1, the computer has to evaluate count + countA(input.substring(1)), and in order to do that it must evaluate countA(input.substring(1)). This alse mean that you need to wait for the call to countA(input.substring(1) to complete so that you can add the value it returns with count. So, the last thing done here is actually the addition, not the recursive call.
 */
	
	// put the first character (i.e. charAt(0)) to the end. String indexes are 0 based. 
    // and recurse with 2nd character (i.e. substring(1)) onwards 
	
	return reverseRecursion(s1.substring(1)) + s1.charAt(0);
}

public static String reverseIteration(String s2){
	
	char[] chars = s2.toCharArray();
	int rsidx = chars.length-1;
	
	for(int lsidx = 0; lsidx<rsidx;lsidx++){
		char temp = chars[lsidx];
		chars[lsidx] = chars[rsidx];
        chars[rsidx--] = temp;
	}
	return new String(chars);
	
}
}
