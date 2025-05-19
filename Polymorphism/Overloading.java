package com.PolymorphismAssignment;

public class Overloading {
	
	void demo(int a)
	{
		System.out.println("value of a :"+a);
	}
	
	public void demo(int a,int b)
	{
		System.out.println("3rd method value of a: "+a+" \nvalue of b: "+b);
	}
	
	public double demo(double a,double b)
	{
		
		System.out.println(" 3rd method value of  a: "+a);
		return a+b;
	}
	
	public int demo(int a,int b,int c)
	{
		return a+b+c;
	}

}
