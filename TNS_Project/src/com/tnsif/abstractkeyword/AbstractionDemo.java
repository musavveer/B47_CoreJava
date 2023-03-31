package com.tnsif.abstractkeyword;

public class AbstractionDemo {
	public static void main(String[] args) {
		Square sq = new Square();
		Rectangle r = new Rectangle();
		sq.calArea();
		sq.show();
		r.calArea();
		r.show();
		Shape s = new Square(3.0f);// cannot create object //but this is through reference
		s.calArea();
		s.show();
		s = new Rectangle(10.0f, 2.0f);
		s.calArea();
		s.show();

	}
}
