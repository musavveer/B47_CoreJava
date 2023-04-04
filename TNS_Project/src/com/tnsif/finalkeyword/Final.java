package com.tnsif.finalkeyword;

// Final variable, Method, Class
public class Final {

	public static void main(String[] args) {
		final int a = 10;
		System.out.println(a++); // final value cannot be changed once assigned
		B obj = new B();
		obj.show();
		
	}

}

class A {
	final public void show() {
		System.out.println("In A show");
	}
}

final class B extends A {
	
	@Override
	public void show() { // we cannot modify a final method
		System.out.println("In B show");
	}
}

class C extends B { // we cannot extend a final class
	
}