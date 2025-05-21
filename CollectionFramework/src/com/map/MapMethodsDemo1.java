package com.map;

import java.util.HashMap;

public class MapMethodsDemo1 {
	
	public static void main(String[] args) {
		
		HashMap<Integer,String> hm=new HashMap<>();
		hm.put(1,"pritesh");
		hm.put(2,"gaurav");
		hm.put(3,"siddhesh");
		hm.put(4,"rohan");
		System.out.println(hm);
		
//		hm.clear();
//		System.out.println("after clear Hashmap list is: \n"+hm);
		
//		hm.replace(1, "vedant");
//		System.out.println(hm);
//		hm.replace(1, "rohan","sahil");
//		System.out.println("After replacement :\n"+hm);
//		
		
		System.out.println(hm.containsValue("gaurav"));
		if(hm.containsKey(3)==true) {
			System.out.println("this is present: "+hm.get(3));
		}
		else {
			System.out.println("this name is not present");
		}
		
	}

}
