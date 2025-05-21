package com.arraylist;

import java.util.ArrayList;
import java.util.Iterator;

public class AddString {

	public static void main(String[] args) {
		
		ArrayList<String> list= new ArrayList<>();
		
		list.add("Gaurav");
		list.add("Suhas");
		list.add("Pragati");
		list.add("Siddhi");
		list.add("sahil");
		list.add("prathmesh");
		list.add("siddhesh");
		list.add("vedant");
		list.add("pritesh");
		list.add("Gaurav");
		
		System.out.println(list);
		
		System.out.println("size of list: "+list.size());
//		
//		Iterator<String> itr=list.iterator();
//		while(itr.hasNext())
//		{
//			System.out.println(itr.next());
//		}

	}
}
