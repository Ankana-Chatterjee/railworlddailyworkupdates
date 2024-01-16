package com.practice.springcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args)
	{
		ApplicationContext context = new ClassPathXmlApplicationContext("com/practice/springcore/springconfig.xml");
		
//		Student student  = (Student)context.getBean("studentbean");
//		System.out.print(student);
		
		Teacher teacher = (Teacher)context.getBean("teacherbean");
		System.out.print(teacher);
	}
}
