package com.scoopen.hibernate;

public class Employee {
	
	//Default constructer
	public Employee() {
		super();
	}
	//Private field
	private int Eid;
	private String Name;
	private String City;
	private Long Salary;
	public int getEid() {
		return Eid;
	}
	
	//setter and getters
	public void setEid(int eid) {
		Eid = eid;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getCity() {
		return City;
	}
	public void setCity(String city) {
		City = city;
	}
	public Long getSalary() {
		return Salary;
	}
	public void setSalary(Long salaary) {
		Salary = salaary;
	}
}
