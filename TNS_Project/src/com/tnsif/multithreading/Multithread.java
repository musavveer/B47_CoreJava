package com.tnsif.multithreading;

public class Multithread extends Thread {
	String task;
	
	Multithread(String task) {
		this.task = task;
	}
	
	public void run() {
		for(int i=1; i<=5; i++) {
			System.out.println(task+ " : " +i);
			try {
				Thread.sleep(1000); // pause the execution for 1000 milliseconds
			} 
			catch (InterruptedException ie) {
				System.out.println(ie.getMessage());
			}
		}
	}
	
	public static void main(String[] args) {
		Multithread th1 = new Multithread("Cut the ticket");
		Multithread th2 = new Multithread("Show your seat number");
		
		th1.start();
		th2.start();
		
	}
}
