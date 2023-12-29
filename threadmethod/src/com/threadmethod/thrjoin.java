package com.threadmethod;

public class thrjoin extends Thread  
{
	 public void run()  
	    {    
	        // print currently executing thread   
	        System.out.println(Thread.currentThread().getName());    
	    }    
	    public static void main(String args[])  
	    {    
	        // creating two thread  
	    	thrjoin t1=new thrjoin();    
	    	thrjoin t2=new thrjoin();    
	        // this will call the run() method  
	        t1.start();    
	        t2.start();    
	    }    

}
