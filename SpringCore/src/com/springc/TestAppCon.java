package com.springc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestAppCon {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ApplicationContext context = 
				new ClassPathXmlApplicationContext("applicationContext.xml");
		Student s = context.getBean("springcr",Student.class);
		s.setId(123);
		s.setName("manjusha");
		s.display();
	}

}
