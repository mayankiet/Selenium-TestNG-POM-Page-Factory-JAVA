package com.qa.testvagrant.testscript;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.qa.testvagrant.testbase.TestBase;
import com.qa.testvargant.pages.LoginPage;

public class LoginTest extends TestBase{
	
	LoginPage loginPage;
	
	public LoginTest() {
		
		super();
	}
	
	@BeforeMethod
	public void setup() {
		
		initialization();
		loginPage = new LoginPage();
	}
	
    @Test(priority = 1)
    public void verifyLogoTest() {
    	
    	boolean flag = loginPage.verifyLogo();
    	Assert.assertTrue(flag);
    }
    @Test(priority = 2)
    public void verifyClickLogin() {
    	
    	loginPage.clickLogin();
    }
    
    @Test(priority = 3)
    public void logIn() {
    	
        loginPage.verifyLogin(prop.getProperty("username"), prop.getProperty("password") );
    }
    
	@AfterMethod
	public void tearDown() {
		
		driver.quit();
	}

}

