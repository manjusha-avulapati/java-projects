package com.springc;

public class Address {

	private int doorno;
	private String colony;
	private String state;
	
	public void setDoorno(int doorno){
		this.doorno = doorno;
	}
	
	public int getDoorNo(){
		return doorno;
	}
	
	public void setColony(String colony){
		this.colony=colony;
	}
	
	public String getColony(){
		return colony;
	}
	
	public void setState(String state){
		this.state = state;
	}
	
	public String getState(){
		return state;
	}
	
	public String toString(){
		return doorno + " " + " " + colony+ " " + state;
	}
}
