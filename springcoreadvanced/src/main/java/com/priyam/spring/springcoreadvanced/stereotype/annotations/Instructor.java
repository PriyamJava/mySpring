package com.priyam.spring.springcoreadvanced.stereotype.annotations;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component // annotaintions based configuration instead of the xml based configuration
public class Instructor {

	@Value("20") // injecting values of primitive types
	private int id;

	@Value("Priyam") // injecting values of primitive types
	private String name;

	@Value("#{Topics}") // injecting values of collection types
	private List<String> topics;

	@Autowired // injecting values of Object types
	private Profile profile;

	public List<String> getTopics() {
		return topics;
	}

	public void setTopics(List<String> topics) {
		this.topics = topics;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Instructor [id=" + id + ", name=" + name + ", topics=" + topics + ", profile=" + profile + "]";
	}

}
