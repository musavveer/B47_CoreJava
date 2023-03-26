package com.tnsif.inheritance;

public class SingleDemo {
	public static void main(String[] args) {
		
		Karnataka k = new Karnataka(); //Single Inheritance and Hierarchical
		Kerala kk = new Kerala(); //Multilevel Inheritance
		k.displayLocalK();
		kk.displayLocalKK();
		k.displayNational();
	}
}
