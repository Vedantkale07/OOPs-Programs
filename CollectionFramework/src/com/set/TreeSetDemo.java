package com.set;

import java.util.Set;
import java.util.TreeSet;
public class TreeSetDemo {
	
	  public static void main(String[] args) {
	        // Create a TreeSet
	        Set<String> treeSet = new TreeSet<>();

	        // Add elements to the TreeSet
	        treeSet.add("Apple");
	        treeSet.add("Banana");
	        treeSet.add("Orange");
	        treeSet.add("Apple"); // Duplicate element, will not be added

	        // Display the TreeSet
	        System.out.println("TreeSet: " + treeSet);

	        // Check if an element exists
	        if (treeSet.contains("Banana")) {
	            System.out.println("TreeSet contains Banana");
	        }

	        // Remove an element
	        treeSet.remove("Orange");

	        // Display the TreeSet after removal
	        System.out.println("TreeSet after removing Orange: " + treeSet);

	        // Iterate over the elements
	        for (String element : treeSet) {
	            System.out.println("Element: " + element);
	        }

	        // Check the size of the TreeSet
	        System.out.println("Size of TreeSet: " + treeSet.size());

	        // Clear the TreeSet
	        treeSet.clear();

	        // Check if the TreeSet is empty
	        if (treeSet.isEmpty()) {
	            System.out.println("TreeSet is empty");
	        }

	  }
}
