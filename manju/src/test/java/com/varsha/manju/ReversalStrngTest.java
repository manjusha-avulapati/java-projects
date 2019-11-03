package com.varsha.manju;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;


public class ReversalStrngTest {
	ReversalStrng s;
	
	@Before
public void init(){
		s = new ReversalStrng();
	}
	
	@Test
	public void reverseStrTest(){
	@SuppressWarnings("static-access")
	String rs =	s.reverseStr("abc");		
		Assert.assertTrue(("cba").equals(rs));
		Assert.assertEquals("cba", rs);
	    Assert.assertFalse(("cbdf").equals(rs));		
	}

}
