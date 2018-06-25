package com.s3s.mytraining.model;

public class Student {

	private long id;
	private String name;
	private String standard;
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setStandard(String standard) {
		this.standard = standard;
	}
	public String getName() {
		return name;
	}
	public String getStandard() {
		return standard;
	}
	
	public Student() {
		super();
		
	}
	public Student(long id, String name, String standard) {
		super();
		this.id = id;
		this.name = name;
		this.standard = standard;
	}
	
	
	
	
}
