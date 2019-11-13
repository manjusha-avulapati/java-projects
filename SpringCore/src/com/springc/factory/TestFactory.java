package com.springc.factory;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestFactory {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");

		A a = ac.getBean("aa", A.class);
		a.msg();

		//FactoryInter fi = (FactoryInter) ac.getBean("fp");
		FactoryInter fi = (FactoryInter) ac.getBean("fnsp");
		fi.print();
	}

}
