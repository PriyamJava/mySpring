package com.priyam.spring.springcore.properties;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext(
				"com/priyam/spring/springcore/properties/propertiesconfig.xml");
		CountriesAndLanguages cl = (CountriesAndLanguages) ctx.getBean("countriesAndLang");

		System.out.println(cl);

	}

}
