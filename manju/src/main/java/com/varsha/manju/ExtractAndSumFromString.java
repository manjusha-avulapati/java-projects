package com.varsha.manju;

public class ExtractAndSumFromString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     int a = getSumNumbers("abc 4 test 5 notext 5 ttt  6 new branch 4 test merge");
     
     System.out.println(a);
	}
	
	public static int getSumNumbers(String s){
		
		int total = 0;
		//split the string by space
		String[] input = s.split("\\s+"); 
		
		for(String s1 : input){
			int nextNumber = 0;
			
			try{
				nextNumber = Integer.parseInt(s1);
			}
			catch (NumberFormatException e) {
				// TODO: handle exception
				System.out.println("not a number");
			}
			
			finally {
				total += nextNumber;
			}
		}
			
		return total;
	}
	

}
