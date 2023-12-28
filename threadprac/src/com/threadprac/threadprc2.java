package com.threadprac;

public class threadprc2 implements Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		 System.out.println("Thread is running...");  
		
	}
	 public static void main(String args[])  
	    {    
		 threadprc2  m1=new threadprc2 ();    
	        Thread t1 =new Thread(m1);    
	        // this will call run() method  
	        t1.start();    
	    }  

}
