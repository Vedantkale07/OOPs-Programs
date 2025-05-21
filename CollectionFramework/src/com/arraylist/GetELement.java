package com.arraylist;

import java.util.ArrayList;
public class GetELement {
	
	public static void main(String[] args) {
		
		ArrayList<Integer> list=new ArrayList<>();
		
		list.add(10);
		list.add(11);
		list.add(15);
		list.add(1);
		list.add(12);
		
		System.out.println(list);
		
		System.out.println("get the element from array");
		System.out.println(list.get(1));
		System.out.println(list.get(3));
		
		}

}
