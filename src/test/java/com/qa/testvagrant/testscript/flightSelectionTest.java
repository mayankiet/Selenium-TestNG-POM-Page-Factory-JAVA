package com.qa.testvagrant.testscript;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.qa.testvagrant.testbase.TestBase;
import com.qa.testvargant.pages.flightSelectionPage;

public class flightSelectionTest extends TestBase{
	
    flightSelectionPage flightSelection;
	
    public flightSelectionTest() {
		
		super();
	}
    
    @BeforeMethod
	public void setup() {
		
		initialization();
		flightSelection = new flightSelectionPage();
	}
    
    @Test
    public void clickFlightTest() {
    	
    	flightSelection.clickBookButton();
    }
    
    @AfterMethod
	public void tearDown() {
		
		driver.quit();
	}

}
