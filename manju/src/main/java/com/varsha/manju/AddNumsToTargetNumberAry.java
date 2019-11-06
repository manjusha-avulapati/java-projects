package com.varsha.manju;

import java.util.HashSet;
import java.util.Set;

import javax.management.RuntimeErrorException;

public class AddNumsToTargetNumberAry {

	/*
	 * Given an array of integers, find two numbers such that they add up to a specific target number?

		For example,
		
		Given numbers: {2, 3,8,7,9}
		Target number: 8
		Result: 3,5
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {3,3,8,7,9};
		findSumTwoToTarget(arr,10);
	}
	
	public static int[] findSumTwoToTarget(int[] input, int target){
		Set<Integer> st = new HashSet<>();
		boolean foundsum = false;
		int[] result = new int[2];
		for(int i = 0; i < input.length;i++){
			int requiredNum = target - input[i];
			System.out.println("current number="  + input[i] + " , requiredNumber = " + requiredNum);
		     if(st.contains(requiredNum)){
		    	 result[0] = input[i];
		    	 result[1] = requiredNum;
		    	              
		    	 foundsum = true;
		    	 break;
		     }
		     else{
		    	 st.add(input[i]); 
		     }
			
		}
		if(!foundsum){
			throw new RuntimeException("sum notfound");
		}
				
		return result;
		
	}

}
