package com.PolymorphismAssignment;

public class Area {
	
	//using method overloading 
	void find(int l,int b)
	{
		System.out.println("area is : "+(l*b));
	}
	void find(int l,int b,int c)
	{
		System.out.println("Area is :"+(l*b*c));
	}

}
