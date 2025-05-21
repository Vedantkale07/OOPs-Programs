package com.arraylist;

import java.util.ArrayList;

public class CheckAllElement {
	
	public static void main(String[] args) {
		
		ArrayList<Integer> list= new ArrayList<>();
		
		list.add(12);
		list.add(10);
		list.add(20);
		list.add(11);
		list.add(15);
		System.out.println(list);
		
		ArrayList<Integer> list2= new ArrayList<Integer>();
		
		list2.add(12);
		list2.add(10);
		list2.add(20);
		System.out.println(list.containsAll(list2));
		
		
	}

}
