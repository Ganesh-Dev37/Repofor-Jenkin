package com.jenkinPractice;

import org.testng.annotations.Test;

public class ParameterTest {
	@Test
	public void p1()
	{
	System.out.println(System.getProperty("Browser"));	
	}
	@Test
	public void p2()
	{
		String user = System.getProperty("Username");
	System.out.println(user);	
	}

}
