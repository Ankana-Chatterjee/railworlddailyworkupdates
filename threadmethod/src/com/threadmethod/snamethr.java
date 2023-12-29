package com.threadmethod;

public class snamethr extends Thread  {
	 public void run()  
	    {    
	        System.out.println("running...");    
	    }    
	    public static void main(String args[])  
	    {    
	        // creating two threads  
	    	snamethr t1=new snamethr();    
	    	snamethr t2=new snamethr();    
	        // start of thread   
	        t1.start();    
	        t2.start();       
	        // change the thread name   
	        t1.setName("monu Sharma");    
	        t2.setName("javatpoint");  
	        // print the thread after changing   
	        System.out.println("After changing name of t1: "+t1.getName());  
	        System.out.println("After changing name of t2: "+t2.getName());  
	    }    
}
