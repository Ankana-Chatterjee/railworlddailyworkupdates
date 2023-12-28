package com.threadprac;

public class threadprc3 extends Thread  {
	  public void run()  
	    {    
	    for(int i=0;i<=5;i++) {
	    	System.out.println(i);
	    }
	    }    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		threadprc3 t1=new threadprc3();    
	        t1.start();    
	        // It will through an exception because you are calling start() method more than one time   
//	        t1.start(); 
	}

}
