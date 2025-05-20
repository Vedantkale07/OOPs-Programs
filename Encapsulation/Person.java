package com.Encapsulation;

public class Person {
	String name;
	int  id;
	int age;
	String loc;
	String city;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getLoc() {
		return loc;
	}
	public void setLoc(String loc) {
		this.loc = loc;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	
	void display()
	{
		System.out.println("Name:"+getName());
		System.out.println("Age:"+getAge());
		System.out.println("Id:"+getId());
		System.out.println("City:"+getCity());
		System.out.println("Location:"+getLoc());
	}
	
	

}
