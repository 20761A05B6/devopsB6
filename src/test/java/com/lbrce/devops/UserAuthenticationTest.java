package com.lbrce.devops;

import org.testng.annotations.Test;

import org.testng.Assert;

public class UserAuthenticationTest {
	@Test
	public void testCase1()
	{
		UserAuthentication uv=new UserAuthentication();
		Assert.assertEquals(false,uv.check("", ""));
	}
	@Test
	public void testCase2()
	{
		UserAuthentication uv=new UserAuthentication();
		Assert.assertEquals(false,uv.check("Gns", "gns@12345"));
	}
	@Test
	public void testCase3()
	{
		UserAuthentication uv=new UserAuthentication();
		Assert.assertEquals(false,uv.check("GNS", "gns"));
	}
	@Test
	public void testCase4()
	{
		UserAuthentication uv=new UserAuthentication();
		Assert.assertEquals(false,uv.check("gns", "gns@13"));
	}
	@Test
	public void testCase5()
	{
		UserAuthentication uv=new UserAuthentication();
		Assert.assertEquals(true,uv.check("GNS", "Gns@123"));
	}

}