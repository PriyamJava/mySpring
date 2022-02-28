package com.priyam.spring.springcore.constructorinjection;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext(
				"com/priyam/spring/springcore/constructorinjection/config1.xml");
		Employee emp = (Employee) ctx.getBean("employee");
		System.out.println(emp);
	}

}
