package com.priyam.spring.springcore.lc.annotations;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {

		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext(
				"com/priyam/spring/springcore/lc/annotations/config.xml");
		Patient patient = (Patient) ctx.getBean("patient");
		System.out.println(patient);
		ctx.registerShutdownHook();

	}

}
