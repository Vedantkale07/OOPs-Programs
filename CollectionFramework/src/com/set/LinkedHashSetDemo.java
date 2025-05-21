package com.set;

import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetDemo {
	
	public static void main(String[] args) {
		
	     Set<String> linkedHashSet = new LinkedHashSet<>();
	        linkedHashSet.add("Apple");
	        linkedHashSet.add("Banana");
	        linkedHashSet.add("Orange");
	//        linkedHashSet.add("Apple"); // Duplicate element, will not be added

	        System.out.println("LinkedHashSet: " + linkedHashSet);
	}

}
