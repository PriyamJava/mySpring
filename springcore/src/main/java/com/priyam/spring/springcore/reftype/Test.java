package com.priyam.spring.springcore.reftype;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext(
				"com/priyam/spring/springcore/reftype/refconfig.xml");
		Student student = (Student) ctx.getBean("student");

		System.out.println(student);

	}

}
