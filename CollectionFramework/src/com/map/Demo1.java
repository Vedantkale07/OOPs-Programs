package com.map;

import java.util.HashMap;

public class Demo1 {
	
	public static void main(String[] args) {
		
		HashMap<Integer, String> str=new HashMap<>();
		str.put(1,"book");
		str.put(1,"notebook");
		str.put(1, "science");
		
		System.out.println(str);
	}

}
