package com.java.spack;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestAppForCollection {

	public static void main(String[] args) {
		
		ApplicationContext fact = new ClassPathXmlApplicationContext("configcollection.xml");		
		
		StudentInfo sinfo = (StudentInfo)fact.getBean("stdObj");
		
		System.out.println("Student Name : " + sinfo.getSname());
		System.out.println("Qualifications : " + sinfo.getQualifiaction());
		System.out.println("Courses Done : " + sinfo.getCourses());
		System.out.println("Course and Faculty : " + sinfo.getCourse_and_faculty());
		System.out.println("Coruse and Fees : " + sinfo.getCourse_and_fees());
	}
}
