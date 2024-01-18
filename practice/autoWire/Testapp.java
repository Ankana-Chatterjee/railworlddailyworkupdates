package com.practice.autoWire;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class Testapp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    ApplicationContext context = new
    		ClassPathXmlApplicationContext("com/practice/autoWire/autowireconfig.xml");
			Emp bean = (Emp) context.getBean("emp1");
			System.out.println(bean);
		}

	}
