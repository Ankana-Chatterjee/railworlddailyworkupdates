package com.railworld.testhiber2;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.railworld.testhiber2.Address;

import java.io.FileInputStream;
import java.sql.Date;

import org.hibernate.Session;    
import org.hibernate.SessionFactory;    
import org.hibernate.Transaction;
import java.io.*;
public class app2 {
	 public static void main( String[] args ) {
		 try {
		  System.out.println( "Hello World!" );
	        //common
	        SessionFactory factory = new Configuration().configure("add.cnf.xml").buildSessionFactory();
	        Session session = factory.openSession();
	        
	        System.out.println(factory);
	        
	        
	        //common
	        Transaction tx = session.beginTransaction();
	        
		Address a = new Address();
        a.setStreet("street1");
        a.setCity("DEHLI");
        a.setOpen(true);
         a.setX(1332.18);
         FileInputStream fls = new FileInputStream("src/main/java/image 2.png");
         byte[] data = new byte[fls.available()];
         fls.read(data);
         a.setImage(data);
        
        System.out.println(a);
        session.save(a);
        tx.commit();
        session.close();
		 }
		 catch(Exception e)
		 {
			 System.out.println(e);
			 e.printStackTrace();
			 
		 }
	  }
	    
}
