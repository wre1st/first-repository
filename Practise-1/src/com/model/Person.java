package com.model;

public class Person {

	private String name;
	private Integer id;
	private double salary;
	private String password;
	public Person() {
		
		
	}
	
	
	public Person(String name, Integer id, double salary) {
		super();
		this.name = name;
		this.id = id;
		this.salary = salary;
	}
	
	
	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	

}
