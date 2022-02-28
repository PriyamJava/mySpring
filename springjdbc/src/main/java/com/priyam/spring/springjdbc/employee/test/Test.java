package com.priyam.spring.springjdbc.employee.test;

import java.util.List;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.priyam.spring.springjdbc.employee.dao.impl.EmployeeDaoImpl;
import com.priyam.spring.springjdbc.employee.dto.Employee;

public class Test {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext(
				"com/priyam/spring/springjdbc/employee/test/config.xml");
		EmployeeDaoImpl dao = (EmployeeDaoImpl) ctx.getBean("employeeDao");

		/*
		 * Employee employee = new Employee(); employee.setId(20);
		 * employee.setFirstName("Vinay"); employee.setLastName("hfjw");
		 */
		// int result= dao.create(employee);
		// int result = dao.update(employee);

		// int result = dao.delete(0);
		// Employee employee = dao.read(2);
		// System.out.println("Employee Reocords: " + employee);

		// System.out.println("Numbers of records deleted are: " + result);

		List<Employee> result = dao.read1();
		for (Employee employee : result) {
			System.out.println("Employee Records: " + employee);

		}

	}

}
