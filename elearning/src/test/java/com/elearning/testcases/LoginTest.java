package com.elearning.testcases;

import org.testng.annotations.Test;

import com.elearning.pages.BaseTest;
import com.elearning.pages.LoginPage;

public class LoginTest extends BaseTest {
	
	
	@Test
	
	void verifyLogin()
	{
		LoginPage lp = new LoginPage(driver);
		String username = "Demo12";
		String password = "Test123456$";
		lp.loginPortal(username,password);
		
	}
	
	

}
