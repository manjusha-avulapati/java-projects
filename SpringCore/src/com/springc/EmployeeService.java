package com.springc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class EmployeeService {
	
	@Autowired
	Employee emp1;
	
	
	public void setEmployee(Employee emp){
		this.emp1 = emp;
	}
	
	public Employee getEmployee(){
		return emp1;
	}

}
