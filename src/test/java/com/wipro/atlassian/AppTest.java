package com.wipro.atlassian;

import org.junit.Test;

import junit.framework.TestCase;


public class AppTest extends TestCase{

	@Test
	public void testsimplemethod(){
		App app=new App();
		assertEquals("wipro",app.simplemethod());
	}
}
