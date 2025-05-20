package com.inheritance;

public class Base {
	
	String title;
	String author;
	int publicationYear;
	
	void display()
	{
		System.out.println("Title: "+title);
		System.out.println("Author: "+author);
		System.out.println("Publication Year: "+publicationYear);
	}
	
	public Base(String title, String author,int publicationYear) {
		// TODO Auto-generated constructor stub
		 this.title=title;
		 this.author=author;
		 this.publicationYear =publicationYear;
		
	}
}
