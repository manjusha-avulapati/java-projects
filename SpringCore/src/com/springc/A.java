package com.springc;

public class A {

	B b;
	public void setB(B b){
		this.b = b;
	}
	
	public B getB(){
		return b;
	}
	public A(){
		System.out.println("a is created");
	}
	
	public void print(){
		System.out.println("print A");
	}
	
	void display(){
		print();
		getB().print();
	}
}
