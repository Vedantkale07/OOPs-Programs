package com.set;

import java.util.Set;
import java.util.HashSet;
public class HashSetDemo {
	
	public static void main(String[] args) {
		  // HashSet example
        Set<String> hashSet = new HashSet<>();
        hashSet.add("Apple");
        hashSet.add("Banana");
        hashSet.add("Orange");
    //    hashSet.add("Apple"); // Duplicate element, will not be added

        System.out.println("HashSet: " + hashSet);
	}

}
