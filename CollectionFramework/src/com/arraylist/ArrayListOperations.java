package com.arraylist;

import java.util.ArrayList;

public class ArrayListOperations {
	
	public static void main(String[] args) {
		
		ArrayList<Integer> list= new ArrayList(); 
			
		list.add(12);
		list.add(10);
		list.add(20);
		list.add(11);
		list.add(15);
		System.out.println(list);
		
		//check no is present in the list or not
		System.out.println(list.contains(12));
		System.out.println(list.contains(100));
		
		// add element in list 
		System.out.println("add element in the list ");
		list.add(0,50);
		System.out.println(list);
		
		
		
		
	}

}
