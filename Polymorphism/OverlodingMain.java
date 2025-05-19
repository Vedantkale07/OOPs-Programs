package com.PolymorphismAssignment;

public class OverlodingMain
{
	public static void main(String[] args) {
		
		Overloading ov= new Overloading();
		ov.demo(10);
		ov.demo(30, 40);
	System.out.println("addition of Double"+ov.demo(22.22d, 22.33d));	
		System.out.println("addition is "+ov.demo(5, 6, 7));
	}

}
