package com.priyam.spring.springjdbc.employee.dao.impl;

import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;

import com.priyam.spring.springjdbc.employee.dao.EmployeeDao;
import com.priyam.spring.springjdbc.employee.dao.rowmapper.EmployeeRowMapper;
import com.priyam.spring.springjdbc.employee.dto.Employee;

public class EmployeeDaoImpl implements EmployeeDao {
	private JdbcTemplate jdbctemplate;

	public JdbcTemplate getJdbctemplate() {
		return jdbctemplate;
	}

	public void setJdbctemplate(JdbcTemplate jdbctemplate) {
		this.jdbctemplate = jdbctemplate;
	}

	@Override
	public int create(Employee employee) {
		String sql = "insert into employee values(?,?,?)";
		int result = jdbctemplate.update(sql, employee.getId(), employee.getFirstName(), employee.getLastName());
		return result;
	}

	@Override
	public int update(Employee employee) {
		String sql = "update employee set firstname=?,lastname=? where id=?";
		int result = jdbctemplate.update(sql, employee.getFirstName(), employee.getLastName(), employee.getId());
		return result;
	}

	@Override
	public int delete(int id) {
		String sql = "delete from employee where id=?";
		int result = jdbctemplate.update(sql, id);
		return result;
	}

	@Override
	public Employee read(int id) {
		String sql = "select * from employee where id = ?";
		EmployeeRowMapper rowmapper = new EmployeeRowMapper();
		Employee employee = jdbctemplate.queryForObject(sql, rowmapper, id);
		return employee;
	}

	@Override
	public List<Employee> read1() {
		String sql = "select * from employee";
		EmployeeRowMapper rowmapper = new EmployeeRowMapper();
		List<Employee> result = jdbctemplate.query(sql, rowmapper);
		return result;
	}

}
