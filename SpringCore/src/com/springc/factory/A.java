package com.springc.factory;

public class A {
	
	private static final A aobj = new A();
	
	private A(){
		System.out.println("private constructor");
	}
	
	private static A getA(){
		System.out.println("factory method");
		return aobj;
	}
	
	public void msg(){
		System.out.println("messagefrom method");
	}

}
