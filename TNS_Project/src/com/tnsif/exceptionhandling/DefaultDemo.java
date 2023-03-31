package com.tnsif.exceptionhandling;

public class DefaultDemo {

	public static void main(String[] args) {
		String str=null;
		try {
			str.equals("Hello");
		}
		catch(Exception e) {
			System.out.println("Null pointer exception");
		}
	}

}
