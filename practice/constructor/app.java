package com.practice.constructor;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class app {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context=new 
				ClassPathXmlApplicationContext("com/practice/constructor/teachconfig.xml");
		teacher bean = (teacher)context.getBean("cons1");
		System.out.println(bean);
	}

}
