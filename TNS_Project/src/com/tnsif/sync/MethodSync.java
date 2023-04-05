package com.tnsif.sync;

public class MethodSync implements Runnable {
	
	int tickets=3;
	int i=1;
	
	synchronized void bookTicket(String name, int ticketsNeeded) {
		if(ticketsNeeded <= 3) {
			System.out.println(ticketsNeeded + " booked to " + name);
			tickets = tickets-ticketsNeeded;
		}
		else {
			System.out.println("No tickets booked");
		}
	}
	
	@Override
	public void run() {
		String name = Thread.currentThread().getName();
		System.out.println("Current Thread is "+name);
		if(name.equals("First Thread")) {
			bookTicket(name,i);
		}
		else if(name.equals("Second Thread")) {
			bookTicket(name,i);
		}
		else if(name.equals("Third Thread")) {
			bookTicket(name,i);
		}
		else {
			bookTicket(name,i);
		}

	}

}
