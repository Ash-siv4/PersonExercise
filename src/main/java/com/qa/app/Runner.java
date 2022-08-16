package com.qa.app;

import java.util.ArrayList;
import java.util.List;

public class Runner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//question 3
//		Person p1 = new Person("ash", 5, "trainer");
////		p1.toString();
//		System.out.println("p1: "+p1.toString());
//		Person p2 = new Person("jh", 6, "s trainer");
//		System.out.println("p2: "+p2.toString());
//		Person p3 = new Person("ed", 6, "sdet trainer");
//		System.out.println("p3: "+p3.toString());
		
		Filter persons = new Filter();
		persons.add(new Person("ash", 5, "trainer"));
		persons.add(new Person("jh", 6, "s trainer"));
		System.out.println(persons.read());
		System.out.println(persons.findPerson("ed"));
		
//		List<Person> pList = new ArrayList<>();
//		pList.add(p1);
//		pList.add(p2);
//		pList.add(p3);
//		System.out.println(pList);
//		ArrayList<Integer> age = new ArrayList<>();
	}

}
