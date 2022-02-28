package com.priyam.spring.springjdbc;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

public class Test {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext(
				"com/priyam/spring/springjdbc/config.xml");
		JdbcTemplate jdbc = (JdbcTemplate) ctx.getBean("jdbcTemplate");
		String sql = "insert into employee values(?,?,?)";
		int update = jdbc.update(sql, 10, "Priyam", "Agarwal");

		System.out.println("Numbers of records inserted are: " + update);

	}

}
