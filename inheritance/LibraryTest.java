package com.inheritance;

public class LibraryTest {
	
	public static void main(String[] args) {
		
		EBook eb= new EBook("www.Ebook.com");
		eb.display();
		
		Derived d= new Derived("ooo");
		d.display();
	}

}
