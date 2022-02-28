package com.priyam.spring.springcore.innerbeans;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext(
				"com/priyam/spring/springcore/innerbeans/config1.xml");
		Employee employee = (Employee) ctx.getBean("employee");

		System.out.println(employee);

	}

}
