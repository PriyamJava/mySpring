package com.priyam.spring.springcoreadvanced.stereotype.annotations;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext(
				"com/priyam/spring/springcoreadvanced/stereotype/annotations/config1.xml");
		Instructor pl = (Instructor) ctx.getBean("instructor");// automatically considered the camel case of classs name
																// if we want to change the name than we can define that
																// @Component("Name") on pojo class
		System.out.println(pl);
	}

}
