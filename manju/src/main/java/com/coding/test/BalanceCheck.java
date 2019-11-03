package com.coding.test;

import java.math.BigDecimal;

public class BalanceCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BalanceCheck b = new BalanceCheck();
		BigDecimal a;
		try {
			a = b.updateBalance(new BigDecimal(100.00),new BigDecimal(0.10));
			System.out.println(a);

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        	}
	
	public BigDecimal updateBalance(BigDecimal bal, BigDecimal rate)throws Exception{
		//pre condition
		
		if(bal == null || rate == null){
			throw new IllegalArgumentException("balance or interest can't be null");
		}
		
		if(!isGreaterThanZero(bal)){
			throw new IllegalArgumentException("balance should be greater than 0");
		}
		
		if(isInputPercentage(rate) || !isGreaterThanZero(rate)){
			throw new IllegalArgumentException("interest rate is not valid");
		}
		
		BigDecimal updBal = bal.multiply(BigDecimal.ONE.add(rate));
		
		//post condition
		//bal = new BigDecimal(0);
		
		if(!isGreaterThanZero(bal)){
			throw new CalucilationException("bal must be a positive number");
			//throw new CalucilationException("cal must be a positive number");
		}
		if(updBal.compareTo(bal)<=0){
			throw new CalucilationException("update balance can not be less or same as older value");
		}
		return updBal;
	}
	
	boolean isGreaterThanZero(BigDecimal a){
		
		return a.compareTo(BigDecimal.ZERO) > 0;
	}
	
	boolean isInputPercentage(BigDecimal b){
		
		return b.compareTo(BigDecimal.ONE)>0;
	}
	

}
