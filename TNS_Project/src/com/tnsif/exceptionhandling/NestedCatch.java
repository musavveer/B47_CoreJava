package com.tnsif.exceptionhandling;

public class NestedCatch {
	int arr[] = new int[5];
	void nestedCatch() {
		try {
			String str = null;
			str.equals("Hello"); // null pointer exception
			arr[2] = 10/0; // Arithmetic exception
			arr[10] = 4; // Array out of bounds exception
			System.out.println("Try block");
		} 
		catch(ArithmeticException a) {
			System.out.println("A number cannot be divided by zero "+a);
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Accessing array element outside specified limit "+e);
		}
		catch (Exception e) {
			System.out.println("No Exception");
		}
	}
	
	public static void main(String[] args) {
		NestedCatch n = new NestedCatch();
		n.nestedCatch();

	}

}
