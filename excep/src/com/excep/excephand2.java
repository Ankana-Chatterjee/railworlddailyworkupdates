package com.excep;

public class excephand2 {
	
	public static void main(String[] args) {
	    try {
	    	 // code that generates exception
	    	int x = 0;
			int y = 10;
			int z = y / x;
			System.out.println(z);
	    }

	    catch (ArithmeticException e) {
	      System.out.println("ArithmeticException => " + e.getMessage());
	    }
	    
	    finally {
	      System.out.println("This is the finally block");
	    }
	  }

}
