package com.arraylist;

public class CustomerDemo {
	

	
	public CustomerDemo(int customerID, String customerName) {
		super();
		this.customerID = customerID;
		this.customerName = customerName;
	}
	
	int customerID;
	String customerName;
	
	@Override
	public String toString() {
		return "CustomerDemo [customerID=" + customerID + ", customerName=" + customerName + "]";
	}

	public int getCustomerID() {
		return customerID;
	}

	public void setCustomerID(int customerID) {
		this.customerID = customerID;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	
	
	

	

}
