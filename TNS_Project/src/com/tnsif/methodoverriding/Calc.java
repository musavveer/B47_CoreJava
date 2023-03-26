package com.tnsif.methodoverriding;

class Calc {
	public int add(int n1, int n2) {
		return n1+n2;
	}
}

class AdvCalc extends Calc {
	public int add(int n1, int n2) { // method overriding
		return n1+n2+2;
	}
}