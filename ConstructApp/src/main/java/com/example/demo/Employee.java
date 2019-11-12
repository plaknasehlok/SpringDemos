package com.example.demo;

public class Employee {
	private int id;
	private String name;
	private Address address;
	
	public Employee()
	{
		System.out.println("definition constructor");
	}
	
	public Employee(int id, String name, Address address)
	{
		super();
		this.id=id;
		this.name=name;
		this.address=address;
		
	}
	
	void display()
	{
		System.out.println(id+" "+name);
		System.out.println(address.toString());
	}
}
