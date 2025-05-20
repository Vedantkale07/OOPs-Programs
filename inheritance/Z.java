package com.inheritance;

public class Z extends Y {
	
	private int m;
	private int n;
	public int getM() {
		return m;
	}
	public void setM(int m) {
		this.m = m;
	}
	public int getN() {
		return n;
	}
	public void setN(int n) {
		this.n = n;
	}
	
	void m3()
	{
		System.out.println("Class Z method ");
		System.out.println("mulitply: "+(m*n));
	}

}
