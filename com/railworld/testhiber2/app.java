package com.railworld.testhiber2;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.railworld.testhiber2.student;

import org.hibernate.Session;    
import org.hibernate.SessionFactory;    
import org.hibernate.Transaction;
public class app {

	    public static void main( String[] args )
	    {
	        System.out.println( "Hello World!" );
	        //common
	        SessionFactory factory = new Configuration().configure("student.config.xml").buildSessionFactory();
	        Session session = factory.openSession();
	        
	        System.out.println(factory);
	        
	        //common
	        Transaction t = session.beginTransaction();
	        
	        student s1 = new student();
	        
	        s1.setId(10);
	        s1.setFirstName("ankana");
	        s1.setLastName("chatarijee");
	        
	        session.save(s1); 
	        
	student s2 = new student();
	        
	        s2.setId(16);
	        s2.setFirstName("rona");
	        s2.setLastName("macchi");
	        
	        //necessary
	        session.save(s2);
	        
	        //common
	        t.commit();  
	        System.out.println("successfully saved"); 
	        
	        
	        factory.close();  
	        session.close();  
	        
	        
	    }
	}