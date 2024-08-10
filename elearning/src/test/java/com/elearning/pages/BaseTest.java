package com.elearning.pages;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import com.elearning.utility.BrowserFactory;
import com.elearning.utility.ConfigDataProvider;

public class BaseTest {
	
	public WebDriver driver;
	public ConfigDataProvider config;
	
	@BeforeClass
	public void setUp()
	{
		config = new ConfigDataProvider();
		driver=BrowserFactory.startApplication(driver,config.getBrowser(),config.getStagingUrl());
	}
	
 @AfterClass
	public void tearDown()
	{
		BrowserFactory.quitBrowser(driver);
	}

}
