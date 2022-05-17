package com.java.spack;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
// constructor dependency
public class TestApp2 {

	public static void main(String[] args) {
		
		ApplicationContext fact = new ClassPathXmlApplicationContext("config.xml");		
		
		Employee  emp = (Employee)fact.getBean("empObj");
		emp.EmpInfo();
		
	}
}
