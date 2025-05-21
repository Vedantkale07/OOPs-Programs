package com.arraylist;

import java.util.TreeSet;

public class TreeSetClass {
	public static void main(String[] args) {
		
		TreeSet ts=new TreeSet(new MyNewComparator());
		ts.add(33);
		ts.add(2);
		ts.add(53);
		ts.add(6);
		System.out.println(ts);
	}

}
