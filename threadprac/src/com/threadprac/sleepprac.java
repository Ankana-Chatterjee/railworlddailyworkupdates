package com.threadprac;

public class sleepprac  extends Thread   {
	 public void run()  
	    {    
	        for(int i=1;i<5;i++)  
	        {    
	            try  
	            {  
	                Thread.sleep(500);  
	            }catch(InterruptedException e){System.out.println(e);}    
	            System.out.println(i);    
	        }    
	    }  

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		sleepprac t1=new sleepprac();    
		sleepprac t2=new sleepprac();    
	        t1.start();    
	        t2.start(); 

	}

}
