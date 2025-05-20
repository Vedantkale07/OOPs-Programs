package com.inheritance;

public class Assign3Main {
	
	public static void main(String[] args) {
		
		CarClass cl= new CarClass();
		cl.setColor("black");
		cl.setSpeed(250);
		cl.setSize(10);
		cl.setCC(12);
		cl.setGears(5);
		
		
		System.out.println("color: "+cl.getColor());
		System.out.println("Size: "+cl.getSize());
		System.out.println("Speed: "+cl.getSpeed());
		System.out.println("Gear: "+cl.getGears());
		System.out.println("CC: "+cl.getCC());
	}
	
}
