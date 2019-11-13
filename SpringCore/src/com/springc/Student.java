package com.springc;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Student {

	private int id;
	private String name;
	private Address address;
	private List<String> subjects;
	private Map<String,Integer> submarks;
	private Map<Teacher,Subjects> teachsub;
	private Map<Teacher, SubInherit> teachsubinherit;
	
	

	public Map<Teacher, SubInherit> getTeachsubinherit() {
		return teachsubinherit;
	}

	public void setTeachsubinherit(Map<Teacher, SubInherit> teachsubinherit) {
		this.teachsubinherit = teachsubinherit;
	}

	public void setTeachsub(Map<Teacher, Subjects> teachsub){
		this.teachsub = teachsub;
	}
	
	public Map<Teacher, Subjects> getTeachsub(){
		return teachsub;
	}
	
	public Map<String, Integer> getSubmarks() {
		return submarks;
	}

	public void setSubmarks(Map<String, Integer> submarks) {
		this.submarks = submarks;
	}

	public void setSubjects(List<String> subjects){
		this.subjects = subjects;
	}
	
	public List<String> getSubjects(){
		return subjects;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getId() {
		return id;
	}

	public void setAddress(Address address){
		this.address = address;
	}
	
	public Address getAddress(){
		return address;
	}
	public void display() {
		System.out.println("id:" + id + " " + "name:" + name + "address:" + address.toString());
		Iterator<String> itr = subjects.iterator();
		while(itr.hasNext()){
			System.out.println(itr.next());
		}
		System.out.println("---------------------");
		Set<Entry<String, Integer>> set = submarks.entrySet();
		Iterator<Entry<String, Integer>> it = set.iterator();
		while(it.hasNext()){
			Entry<String, Integer> e = it.next();
			System.out.println("subject : " + e.getKey()+ "marks : " + e.getValue());
		}
			System.out.println("-------------------");
			
			Set<Entry<Teacher, Subjects>> s = teachsub.entrySet();
			
		Iterator<Entry<Teacher, Subjects>> i = s.iterator();
		while(i.hasNext()){
			Entry<Teacher, Subjects> em = i.next();
			System.out.println(em.getKey() + " - " + em.getValue());
		}
		
		System.out.println("------inheritance------");
		
		Set<Entry<Teacher, SubInherit>> ss = teachsubinherit.entrySet();
		Iterator<Entry<Teacher, SubInherit>> ii = ss.iterator();
		while(ii.hasNext()){
			Entry<Teacher, SubInherit> mp = ii.next();
			System.out.println("inheritance" + mp.getKey() + "--" + mp.getValue());
		}
		
				
	}

}
