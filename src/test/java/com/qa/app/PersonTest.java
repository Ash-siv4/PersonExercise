package com.qa.app;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PersonTest {

	Person p;
	
	@Test
	public void testName() {
//		assertequals(expected,actual)
		Assertions.assertEquals("ash",p.getName());
	}
	
	
}
