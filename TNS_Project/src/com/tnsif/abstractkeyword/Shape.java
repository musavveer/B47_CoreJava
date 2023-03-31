package com.tnsif.abstractkeyword;

// Abstraction is a process of hiding the implementation details and showing only functionality to the user.

public abstract class Shape {
	protected float area;

	abstract void calArea();

	void show() {
		System.out.println("area of shape" + area);
	}
}
