package com.priyam.spring.springcore.propertyplaceholder;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext(
				"com/priyam/spring/springcore/propertyplaceholder/config.xml");
		MyDAO mydao = (MyDAO) ctx.getBean("myDAO");
		System.out.println(mydao);
	}

}
