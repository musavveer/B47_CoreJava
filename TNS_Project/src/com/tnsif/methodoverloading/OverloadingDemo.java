package com.tnsif.methodoverloading;

public class OverloadingDemo {

	public static void main(String[] args) {
		Point ob=new Point();
		System.out.println(ob);
		Point ob1=new Point(14.5f);
		System.out.println(ob1);
		Point ob3 = new Point(10.4f, 12.3f);
		System.out.println(ob3);

	}

}
