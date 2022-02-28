package com.priyam.spring.springcoreadvanced.autowiring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext(
				"com/priyam/spring/springcoreadvanced/autowiring/config1.xml");
		Employee emp = (Employee) ctx.getBean("employee");
		System.out.println(emp);
	}

}
