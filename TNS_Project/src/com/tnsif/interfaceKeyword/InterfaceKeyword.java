package com.tnsif.interfaceKeyword;

// An interface in Java is a blueprint of a class. It has static constants and abstract methods.

interface A {
	int age=23; // by default variables are final and static
	String place="Bangalore";
	
	void show(); // by default methods are public abstract
	void config();
}

class B implements A { // methods must be defined inside
	public void show() {
		System.out.println("In show");
	}
	public void config() {
		System.out.println("In config");
	}
}

public class InterfaceKeyword {
	
	public static void main(String[] args) {
		A obj; // directly instantiate
		obj = new B();
		obj.show();
		obj.config();
	}
}