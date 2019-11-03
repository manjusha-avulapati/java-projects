package com.varsha.manju;

import org.junit.Assert;
import org.junit.Test;

public class ExtractAndSumFromStringTest {
		
	@Test
	
	public void getSumNumbersTest(){		
		int sum = ExtractAndSumFromString.getSumNumbers("abc 1 kjkjk 2 jkk 2 jhjh");
		System.out.println(sum);
		Assert.assertEquals(5, sum);
		//Assert.assertTrue(sum == 5);		
	}

}
