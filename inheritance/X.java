package com.inheritance;

public class X {
	
	private int a;
	private int b;
	
	public int getA() {
		return a;
	}
	public void setA(int a) {
		this.a = a;
	}
	public int getB() {
		return b;
	}
	public void setB(int b) {
		this.b = b;
	}
	
	void m1()
	{
		System.out.println("Class X method");
		System.out.println("addtion is : "+(a+b));
	}
	
}
