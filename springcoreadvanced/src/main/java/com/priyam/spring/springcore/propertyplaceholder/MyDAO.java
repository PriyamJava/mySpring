package com.priyam.spring.springcore.propertyplaceholder;

public class MyDAO {
	private String dbServer;
	private String dbPort;

	MyDAO(String dbServer, String dbPort) {

		this.dbServer = dbServer;
		this.dbPort = dbPort;
	}

	@Override
	public String toString() {
		return "MyDAO [dbServer=" + dbServer + ", dbPort=" + dbPort + "]";
	}

}
