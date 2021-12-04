package com.bankg99.testcases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.bankg99.pageobjects.LoginPageObject;

public class TC_01LoginTest extends BaseClass {

	@Test
	public void LoginTest() throws IOException
	{
		driver.get(baseURL);
		logger.info("URL is opened");
		
		LoginPageObject lp = new LoginPageObject(driver);
		lp.setUserName(username);   logger.info("TC1- Entered username");
		lp.setPassword(password);   logger.info("TC1- Entered password");
		lp.clickLogin();            logger.info("TC1- Login is clicked");

		if(driver.getTitle().equals("Guru99 Bank Manager HomePage"))
		{
			Assert.assertTrue(true);
			logger.info("TC1- Login test passed");
		}
		else
		{

			captureScreen(driver,"LoginTest");
			Assert.assertTrue(false);
			logger.info("TC1- Login test failed");
		}
	}

}
