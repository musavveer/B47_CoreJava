package com.tnsif.sync;

public class Demo {

	public static void main(String[] args) {
		/*
		 * For Runnable:
		 * Create a class object
		 * pass the object to thread class
		 * 
		 */
		
		MethodSync s = new MethodSync(); 
		
		Thread t1 = new Thread(s);
		Thread t2 = new Thread(s);
		Thread t3 = new Thread(s);
		Thread t4 = new Thread(s);
		
		t1.setName("First Thread");
		t2.setName("Second Thread");
		t3.setName("Third Thread");
		t4.setName("Fourth Thread");
		
		t1.start();
		t2.start();
		t3.start();
		t4.start();
	}

}
