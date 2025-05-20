package com.inheritance;

public class Y extends X {
	
	private int p;
	private int q;
	
	
	public int getP() {
		return p;
	}
	public void setP(int p) {
		this.p = p;
	}
	public int getQ() {
		return q;
	}
	public void setQ(int q) {
		this.q = q;
	}
	
	void m2()
	{
		System.out.println("class Y method ");
		System.out.println("subtraction: "+(p-q));
	}
	

}
