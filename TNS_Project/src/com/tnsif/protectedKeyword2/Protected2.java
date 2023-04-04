package com.tnsif.protectedKeyword2;

import com.tnsif.protectedKeyword.Protected;

public class Protected2 extends Protected{
	
	public void abc() {
		display();
	}

	public static void main(String[] args) {
		Protected2 p2 = new Protected2();
		p2.abc();
		p2.display();
	}

}
