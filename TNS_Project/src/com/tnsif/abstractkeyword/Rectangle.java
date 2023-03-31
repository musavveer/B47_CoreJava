package com.tnsif.abstractkeyword;

public class Rectangle extends Shape {
	float length;
	float width;

	public Rectangle() {
		this.length = 2.0f;
		this.width = 3.0f;
	}

	Rectangle(float width, float length) {
		this.width = width;
		this.length = length;
	}

	@Override
	void calArea() {
		area = width * length;

	}
}
