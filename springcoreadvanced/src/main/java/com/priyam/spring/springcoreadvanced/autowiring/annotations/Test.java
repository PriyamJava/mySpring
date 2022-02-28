package com.priyam.spring.springcoreadvanced.autowiring.annotations;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext(
				"com/priyam/spring/springcoreadvanced/autowiring/annotations/config1.xml");
		Employee emp = (Employee) ctx.getBean("employee");
		System.out.println(emp);
	}

}
