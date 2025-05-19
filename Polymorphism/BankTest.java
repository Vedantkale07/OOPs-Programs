package com.PolymorphismAssignment;

public class BankTest {
	
	public static void main(String[] args) {
		
		// interest rate of all bank by polymorphism
		
		System.out.println("------Interest rate of Banks--------");
		Bank bank1= new Bank();
		System.out.println("bank1 ="+bank1.getRateOfInterest());
		
		Bank bank2= new SBIBank();
		System.out.println("SBIbank="+bank2.getRateOfInterest());

		Bank bank3= new AxisBank();
		System.out.println("Axisbank1="+bank3.getRateOfInterest());
		
		Bank bank4= new ICICBank();
		System.out.println("ICICbank="+bank4.getRateOfInterest());
	}

}
