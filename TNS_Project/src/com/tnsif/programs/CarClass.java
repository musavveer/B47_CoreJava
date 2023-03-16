package com.tnsif.programs;

/*
 * Program to demonstrate classes and objects
 */

public class CarClass {
	
	int model;
	String color;
	int reg;
	int amount=90000;
	
	void forward() {
		System.out.println("Car is moving in forward direction");
	}

	void backward() {
		System.out.println("Car is moving in backward direction");	
	}
	
	void stop() {
		System.out.println("Car is stopped");
	}
}
