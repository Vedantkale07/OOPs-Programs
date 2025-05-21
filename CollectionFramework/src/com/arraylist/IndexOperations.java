package com.arraylist;

import java.util.ArrayList;

public class IndexOperations {

	public static void main(String[] args) {
		
		ArrayList<Integer> list=new ArrayList<Integer>();
		list.add(12);
		list.add(10);
		list.add(20);
		list.add(11);
		list.add(15);
		System.out.println(list);
		
		//get index of elements
		System.out.println("\n index of 20: "+list.indexOf(20));
		
		//last index of list
		System.out.println("\n last index of list:");
		System.out.println(list.lastIndexOf(list));
		
		
	}
}
