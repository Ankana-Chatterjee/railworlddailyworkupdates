package com.threadmethod;

public class currthread extends Thread {
	 public void run()  
	    {    
	        // print currently executing thread   
	        System.out.println(Thread.currentThread().getName());    
	    }    
	    public static void main(String args[])  
	    {    
	        // creating two thread  
	    	currthread t1=new currthread();    
	    	currthread t2=new currthread();    
	        // this will call the run() method  
	        t1.start();    
	        t2.start();    
	    }    

}
