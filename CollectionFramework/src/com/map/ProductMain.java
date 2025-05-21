package com.map;

import java.util.HashMap;
import java.util.Set;

public class ProductMain {

	public static void main(String[] args) {
		
		HashMap<Integer, Product> hm=new HashMap<>();
		hm.put(1,new Product(101,"pen"));
		hm.put(2,new Product(102,"pencil"));
		hm.put(3,new Product(1104,"pen3"));
		
		Set<Integer> prodKey= hm.keySet();
		
		for(int  key : prodKey) {
			
			System.out.println(key);
			Product pro = hm.get(key);
			System.out.println(pro.productId);
			System.out.println(pro.productName);
			
		}
		
		
	}
}
