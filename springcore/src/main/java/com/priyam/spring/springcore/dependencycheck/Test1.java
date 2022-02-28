package com.priyam.spring.springcore.dependencycheck;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test1 {

	public static void main(String[] args) {

		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext(
				"com/priyam/spring/springcore/dependencycheck/config1.xml");
		Prescription prescription = (Prescription) ctx.getBean("prescription");
		System.out.println(prescription);

	}

}
