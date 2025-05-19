package com.PolymorphismAssignment;

public class OverrideDemo {
	
	public static void main(String[] args) 
	{
		DerivedClass dd= new DerivedClass();
		dd.method1();
		
		BaseClass bc= new BaseClass();
		bc.method1();
	}

}
