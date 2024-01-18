package com.collection;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new
				ClassPathXmlApplicationContext("com/collection/collectconfig.xml");
		Office off =(Office)context.getBean("office1");
		System.out.println(off);
	}

}
