package com.nc.entity;

import java.util.List;

public class Employee {
	
	private long employeeId;
	private String name;
	private int age;
	private double salary;
	private String dept;
	private Address address;
	private List<String> phone;
	public long getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(long employeeId) {
		this.employeeId = employeeId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public List<String> getPhone() {
		return phone;
	}
	public void setPhone(List<String> phone) {
		this.phone = phone;
	}
	public Employee(long employeeId, String name, int age, double salary, String dept, Address address,
			List<String> phone) {
		super();
		this.employeeId = employeeId;
		this.name = name;
		this.age = age;
		this.salary = salary;
		this.dept = dept;
		this.address = address;
		this.phone = phone;
	}
	
	public Employee() {
		
	}
	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", name=" + name + ", age=" + age + ", salary=" + salary
				+ ", dept=" + dept + ", address=" + address + ", phone=" + phone + "]";
	}
	

}
