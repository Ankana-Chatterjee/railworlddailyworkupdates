package com.excep;

public class excephand {

	public static void main(String[] args) {
		try {
			int x = 0;
			int y = 10;
			int z = y / x;
			System.out.println(z);

		} catch (ArithmeticException e) {
//			System.out.println("An ArithmeticException occurred: " + e.printStackTrace());
//			e.printStackTrace();
//			System.out.println(e.getMessage());
			System.out.println(e);
			
		}
	}


}
