package com.tnsif.protectedKeyword;

// can be used in same package and different package but with subclass
public class Protected {
	protected void display() { 
		System.out.println("Inside Protected method");
	}
	
	public static void main(String[] args) {
		Protected obj = new Protected();
		obj.display(); 
	}
}
