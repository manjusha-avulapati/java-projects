package com.springc;

public class Teacher {

	private int id;
	private String tname;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public void setTname(String tname){
		this.tname = tname;
	}
	
	public String getTname(){
		return tname;
	}
	
	public String toString(){
		return id + " : " + tname; 
	}
	
}
