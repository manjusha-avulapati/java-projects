package com.springc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class EmployeeServiceConstructAutowird {
	
	private Employee em;
	
	@Autowired
	
	public EmployeeServiceConstructAutowird(@Qualifier("employee")Employee emm){
		this.em = emm;
		System.out.println("empservice construcotr autowired");
		
	}

	public Employee getEmployee(){
		return this.em;
	}
}
