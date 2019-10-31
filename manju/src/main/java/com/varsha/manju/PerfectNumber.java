package com.varsha.manju;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class PerfectNumber {

	/* A perfect number is a positive integer that is equal to the sum 
	of its proper divisors. The smallest perfect number is 6, which is the sum of 
	1, 2, and 3.Other perfect numbers are 28, 496, and 8,128.
	*/	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
List<Integer> pn = getPerfectNumber(0, 10);
System.out.println(pn);
	}
	
	public static List<Integer> getPerfectNumber(int from, int to){
		
		 List<Integer> perfNum = new ArrayList<Integer>();
		 
		 for(int i=from;i<=to;i++){
			 //set the devisables
			 Set<Integer> devisors = new HashSet<Integer>();
			 for(int j=1;j<i;j++){
				 //System.out.println("manjui" + i + "manjushaj" +j);
				 
				 if(i%j==0 && i!=j){
					// System.out.println(j);
					 devisors.add(j);
				 }
			 }
			 int total = 0;
			 for(Integer pfn : devisors){
				 System.out.println(pfn);
				 total +=pfn;
			 }
			// if i > 0 as 0 is not a perfect number & 
	            // total of the divisors = i then it is a perfect number
	            if (total == i && i > 0) {
	            	perfNum.add(i);
	            }
	            
	         
		 }
		return perfNum;
		 
	}
	

}
