package com.qa.testvagrant.testscript;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.qa.testvagrant.testbase.TestBase;
import com.qa.testvargant.pages.reviewFlightdetailsPage;

public class reviewFlightDetailsTest extends TestBase{
	
	reviewFlightdetailsPage reviewFlightDetails;
	
    public reviewFlightDetailsTest() {
		
		super();
	}
   
    @BeforeMethod
	public void setup() {
		
		initialization();
		reviewFlightDetails = new reviewFlightdetailsPage();
	}
    
    @Test
    public void clickContinueAndAcceptTest() {
    	
    	reviewFlightDetails.clickContinueAndAccept();
    }
    
    @AfterMethod
	public void tearDown() {
		
		driver.quit();
	}
	
}
