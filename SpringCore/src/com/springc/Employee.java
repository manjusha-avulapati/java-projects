package com.springc;

public class Employee {
	
	private String ename;
	public String getEname() {
		return ename;
	}
	
	public Employee() {
		// TODO Auto-generated constructor stub
	}



	public void setEname(String ename) {
		this.ename = ename;
	}



	public String getDesg() {
		return desg;
	}



	public void setDesg(String desg) {
		this.desg = desg;
	}



	public int getSalary() {
		return salary;
	}



	public void setSalary(int salary) {
		this.salary = salary;
	}



	private String desg;
	private int salary;
	
	public Employee(String ename,String desg, int salary){
		super();
		this.ename=ename;
		this.desg = desg;
		this.salary = salary;
	}
	
	
	
	public void show(){
		System.out.println( "ename:" + ename + "----" + "salary:" + 
	salary + "---" + desg);
	}

}
