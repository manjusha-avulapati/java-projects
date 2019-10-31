package com.varsha.manju;

public class RepeatedChrSumIteration {

	/*
	 * Can you write a sample code that will count the number of “A”s in a given
	 * text “AAA rating“? Show both iterative and recursive approaches?
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.out.println(new RepeatedChrSumIteration().countAIterative("AAA rating"));
		//System.out.println(new RepeatedChrSumIteration().countARecursive("AAA rating"));
		System.out.println(countChar("AAA rating", "A"));
	}

	// iteration
	public int countAIterative(String s) {

		int count = 0;
		if (s == null && s.length() == 0) {
			return 0;
		}
		for (int i = 0; i < s.length(); i++) {
			if (s.substring(i, i + 1).equalsIgnoreCase("A")) {
				count++;
			}
		}
		return count;
		}
	
	//Recursion
	
	public int countARecursive(String s1){
		if(s1 == null && s1.length() == 0){
			return 0;
		}		
		int count1 = 0;
		if(s1.substring(0, 1).equals("A")){
			count1 = 1;
		}
		
		return count1 + countARecursive(s1.substring(1));
	}
	
	//recursive2
	
	public static int countChar(String str, String character) {

	    if(str.length() == 0) {
	        return 0;
	    }

	    if (!(str.substring(0,1).equals(character))) {
	        return countChar(str.substring(1), character);
	    } else {
	        return 1 + countChar(str.substring(1), character);
	    }
	}
	
	

}
