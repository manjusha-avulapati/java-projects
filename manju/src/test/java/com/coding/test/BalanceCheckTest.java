package com.coding.test;

import java.math.BigDecimal;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;


 
 
public class BalanceCheckTest {

	BalanceCheck b;
	
	@Before
	public void init(){
		b = new BalanceCheck();
	}
	@Test
	public void testUpdateBalance()throws Exception{
		BigDecimal updatedBal = b.updateBalance(new BigDecimal("100.00"), new BigDecimal("0.10"));
		Assert.assertTrue(new BigDecimal("110.00").compareTo(updatedBal) == 0);
	}
	
	@Test(expected = java.lang.IllegalArgumentException.class)
	public void testNativeUpdateBal() throws Exception
	{
		BigDecimal updatedBal = b.updateBalance(new BigDecimal("-100.00"), new BigDecimal("0.10"));
	}
	
}
