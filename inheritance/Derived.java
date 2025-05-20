package com.inheritance;

public class Derived extends Base {

	String genre;

	public Derived(String genre) {
		super("abc", "ggg", 8888);
		this.genre=genre;
		
	}

	void display() {
		System.out.println("\n---derived class---");
		System.out.println("title:"+title);
		System.out.println("Author:"+author);
		System.out.println("genre: " + genre);
		
	}

}
