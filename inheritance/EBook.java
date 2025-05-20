package com.inheritance;

public class EBook extends Base{
	
	String downloadLink;
	
	public EBook(String downloadLink)
	{
		super("xxx","yyyy",4);
		this.downloadLink=downloadLink;
	}
	void display()
	{
		System.out.println("\n---EBook Details----");
		System.out.println("title:"+title);
		System.out.println("Author:"+author);
		System.out.println("downloadlink:"+downloadLink);
		
	}
	

}
