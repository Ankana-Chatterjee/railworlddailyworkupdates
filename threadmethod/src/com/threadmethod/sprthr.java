package com.threadmethod;

public class sprthr extends Thread {
	 public void run()  
	    {    
	        System.out.println("Priority of thread is: "+Thread.currentThread().getPriority());    
	    }    
	    public static void main(String args[])  
	    {    
	        // creating one thread   
	    	sprthr t1=new sprthr();    
	        // print the maximum priority of this thread  
	        t1.setPriority(Thread.MAX_PRIORITY);    
	        // call the run() method  
	        t1.start();    
	    }    
}
