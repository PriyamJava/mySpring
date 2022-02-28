package com.priyam.spring.springcoreadvanced.collections.standalone;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext(
				"com/priyam/spring/springcoreadvanced/collections/standalone/config1.xml");
		ProductList pl = (ProductList) ctx.getBean("productNames");
		System.out.println(pl);
	}

}
