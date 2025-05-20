package com.inheritance;

public class Assign4Main {
	
	public static void main(String[] args) {
		
		Z ob= new Z();
		
		ob.setA(2);
		ob.setB(3);
		ob.setM(4);
		ob.setN(5);
		ob.setP(6);
		ob.setQ(0);
		
		System.out.println(ob.getA());
		System.out.println(ob.getB());
		ob.m1();
		
		System.out.println(ob.getM());
		System.out.println(ob.getN());
		ob.m2();
		
		System.out.println(ob.getP());
		System.out.println(ob.getQ());
		ob.m3();
		
	
	
	}

}
