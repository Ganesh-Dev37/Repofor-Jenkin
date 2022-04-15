package com.jenkinPractice;

import org.testng.annotations.Test;

public class ParameterTest {
	@Test
	public void p1()
	{
	System.out.println(System.getProperty("browser"));	
	}
	@Test
	public void p2()
	{
		String user = System.getProperty("username");
	    System.out.println(user);	
	}
	@Test
	public void p3()
	{
		System.out.println(System.getProperty("url"));
	}
	@Test
	public void p4()
	{
		String pass = System.getProperty("password");
		System.out.println(pass);
	}

}
