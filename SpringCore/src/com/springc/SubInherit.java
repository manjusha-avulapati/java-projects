package com.springc;

public class SubInherit extends Subjects{

	private String addfld;

	public String getAddfld() {
		return addfld;
	}

	public void setAddfld(String addfld) {
		this.addfld = addfld;
	}
	
	public String toString(){
		
		return getSname() + getAuthor() + ":" + addfld;
	}
}
