package com.varsha.manju;

public class TailRecursiveCall {

	/*
	 * In tail recursion, the last thing done is the recursion and the addition
	 *  would have been done before. You don’t have any use for the old information
	 *   because there’s nothing to do after the recursive call. You can throw out
	 *    all of your old information and simply run the function again with the
	 *     new set of parameters. This means you run with shorter call stack leading
	 *      to lower memory usage and better performance.
	 */
	   public int countA(String input) {
	     //input validation
	     if (input == null || input.length() == 0) {
	       return 0;
	     }
	  
	     return countA(input, 0) ;
	   }
	 
	   public int countA(String input, int count) {
	      // exit condition – recursive calls must have an exit condition
	      if (input.length() == 0) {
	        return count;
	      }
	  
	      // check first character of the input
	     if (input.substring(0, 1).equals("A")) {
	       count = count + 1;
	     }

	     // recursive call is the last call as the count is cumulative
	     return countA(input.substring(1), count);
	   }

	   public static void main(String[] args) {
	     System.out.println(new TailRecursiveCall().countA("AAA rating"));
	   }
	}
