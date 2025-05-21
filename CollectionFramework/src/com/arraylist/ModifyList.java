package com.arraylist;

import java.util.ArrayList;

public class ModifyList {
	
	public static void main(String[] args) {
		
		ArrayList<Integer> list= new ArrayList<Integer>();
		
		list.add(12);
		list.add(10);
		list.add(20);
		list.add(11);
		list.add(15);
		System.out.println(list);
		
		//modify list
		
		list.set(0, 100);
		list.set(1, 200);
		System.out.println("modify list:\n"+list);
		
    
	}

}
