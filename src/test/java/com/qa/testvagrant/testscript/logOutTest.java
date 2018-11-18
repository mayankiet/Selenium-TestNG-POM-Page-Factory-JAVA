package com.qa.testvagrant.testscript;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.qa.testvagrant.testbase.TestBase;
import com.qa.testvargant.pages.logOutPage;

public class logOutTest extends TestBase{

    logOutPage logout;
	
    public logOutTest() {
		
		super();
	}
   
    @BeforeMethod
	public void setup() {
		
		initialization();
		logout = new logOutPage();
	}
    
    @Test
    public void checkOutTest() {
    	
    	logout.checkOut();
    	
    }
    
    @AfterMethod
	public void tearDown() {
		
		driver.quit();
	}

}
