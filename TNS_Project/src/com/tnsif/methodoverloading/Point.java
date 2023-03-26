package com.tnsif.methodoverloading;

public class Point {
	
	private float x;
	public float y = 15;
	public Point() {
		x=1.0f;
		y=0.1f;
	}
	
	public Point(float x) {
		
		this.x = x;
	
	}
	
	public Point(float x, float y) {
		this.x = x;
		this.y = y;
	}
	
	@Override
	public String toString() {
		return "Point [x = " + x + ", y = " + y + "]";
	}
}
