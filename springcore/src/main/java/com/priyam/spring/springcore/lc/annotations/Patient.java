package com.priyam.spring.springcore.lc.annotations;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Patient {
	private int id;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
		System.out.println("Inside setter method");// init method invoked after the properties are injected;destroy
													// method is used just before the destroying the spring container`
	}

	// Life cycle methods using annotations

	@PostConstruct
	public void h1() {
		System.out.println("Inside hi method");

	}

	@PreDestroy
	public void bye() {
		System.out.println("Inside bye method");
	}

	@Override
	public String toString() {
		return "Patient [id=" + id + "]";
	}

}
