package com.qa.app;

import java.util.ArrayList;
import java.util.List;

public class Filter {

	List<Person> pList = new ArrayList<>();

	public void add(Person p) {
		pList.add(p);
	}

	public List<Person> read() {
		return pList;
	}

	// question 5
	public Person findPerson(String n) {
		Person match = null;
		for (Person p : pList) {
			if (p.getName() == n) {
				match = p;
			}
		}
		return match;
	}

}
