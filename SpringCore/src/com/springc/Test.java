package com.springc;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*Resource r = new ClassPathResource("applicationContext.xml");
		BeanFactory f = new XmlBeanFactory(r);*/
		
		ApplicationContext c = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		/*Employee e = (Employee)f.getBean("employee");
		e.show();*/

		EmployeeService es = c.getBean("empservice", EmployeeService.class);
		
		System.out.println(es.getEmployee().getEname());
		System.out.println(es.getEmployee().getSalary());
		System.out.println(es.getEmployee().getDesg());
		System.out.println("-------------------------");
		
		
		A a = c.getBean("a", A.class);
		a.display();
		System.out.println("====================");
		EmployeeServiceConstructAutowird esa = 
				c.getBean("empserviceautoqualifier", EmployeeServiceConstructAutowird.class);
	System.out.println(esa.getEmployee().getEname());
	System.out.println(esa.getEmployee().getSalary());
	
	

	
	}
	

}
