package com.arraylist;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Set;

public class Test {

	public static void main(String[] args) {
		HashMap<Integer, CustomerDemo> hm = new HashMap<>();

		hm.put(1, new CustomerDemo(12, "om"));
		hm.put(2, new CustomerDemo(13, "Roy"));
		hm.put(3, new CustomerDemo(14, "Sunny"));

		Set<Integer> custKey = hm.keySet();

		for (int key : custKey) {
			System.out.println(key);
			CustomerDemo value = hm.get(key);
			System.out.println(value.getCustomerID());
			System.out.println(value.getCustomerName());
			

		}
						
	}

}
