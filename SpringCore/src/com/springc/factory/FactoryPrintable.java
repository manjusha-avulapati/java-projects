package com.springc.factory;

public class FactoryPrintable {
	
	//static factory method
	
	public static FactoryInter getPrintable(){
		
		return new PrintB();
	}

	public FactoryInter getNonsPrintable()
	{
		return new PrintA();
	}
}
