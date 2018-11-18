package com.qa.testvagrant.testscript;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.qa.testvagrant.testbase.TestBase;
import com.qa.testvargant.pages.FlightBookingPage;

public class FlightBookingTest extends TestBase{
	
	FlightBookingPage flightbookingPage;
	
    public FlightBookingTest() {
		
		super();
	}
    
    @BeforeMethod
	public void setup() {
		
		initialization();
		flightbookingPage = new FlightBookingPage();
	}
    
    @Test(priority = 1)
    public void clickFlightTest() {
    	
    	flightbookingPage.clickFlightLink();
    }
    
    @Test(priority = 2)
    public void searchFlightTest() {
    	
    	flightbookingPage.searchFlight();
    	
    	
    }
    
    @AfterMethod
	public void tearDown() {
		
		driver.quit();
	}

}
