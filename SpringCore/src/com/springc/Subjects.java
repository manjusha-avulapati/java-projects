package com.springc;

public class Subjects {
	
	private String sname;
	private String author;
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	
	public String toString(){
		return sname + " : " + author;
	}
	

}
