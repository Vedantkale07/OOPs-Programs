package com.comparableAndComparator;

import java.util.ArrayList;
import java.util.Collections;

public class StudentMain {
	
	public static void main(String[] args) {
		
		ArrayList<Student> list= new ArrayList<>();
		list.add(new Student("vedant",99));
		list.add(new Student("gaurav",86));
		list.add(new Student("sahiil",91));
		list.add(new Student("prites",75));
		list.add(new Student("siddhu",78));
		
		// print the arraylist 
		System.out.println(list);
		
		// print info using lambda funtions
		list.forEach(System.out::println);
		
		//sort
		System.out.println("\nsort by comparable:");
		Collections.sort(list);
		
		list.forEach(System.out::println);
	}

}
