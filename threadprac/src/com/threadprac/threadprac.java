package com.threadprac;

public class threadprac extends Thread  {
	   public void run()  
	    {    
	        System.out.println("Thread is running...");    
	    }  
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		threadprac t1=new threadprac();    
	        // this will call run() method  
	        t1.start(); 
	}

}
