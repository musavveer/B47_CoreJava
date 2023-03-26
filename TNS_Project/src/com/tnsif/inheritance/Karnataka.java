package com.tnsif.inheritance;

class India {
	protected String lang="Hindi";
	void displayNational() {
		System.out.println("National lang"+" "+lang);
		}
}
//Single Inheritance 
public class Karnataka extends India {
	public String lang="Kannada";
	void displayLocalK() {
		System.out.println("Local lang"+" "+lang);
		}
	
}
//Multilevel And Hierarchical Inheritance 
class Kerala extends Karnataka { 
	public String lang="Malyalam";
	void displayLocalKK() {
		System.out.println("Local lang"+" "+lang);
		}
	/*
class Kerala extends India { 
	public String lang="Malyalam";
	void displayLocal() {
		System.out.println("local lang"+" "+lang);
		}
}*/
}
