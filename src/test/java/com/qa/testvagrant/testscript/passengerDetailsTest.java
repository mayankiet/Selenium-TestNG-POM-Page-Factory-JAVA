package com.qa.testvagrant.testscript;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.qa.testvagrant.testbase.TestBase;
import com.qa.testvargant.pages.passengerDetailPage;

public class passengerDetailsTest extends TestBase{
	
	passengerDetailPage passengerDetail;
	
    public passengerDetailsTest() {
		
		super();
	}
   
    @BeforeMethod
	public void setup() {
		
		initialization();
		passengerDetail = new passengerDetailPage();
	}
    
    @Test
    public void submitPassengerDetailsTest() {
    	
    	passengerDetail.submitPassengerDetails("Mayank", "Chauhan");
    	
    }
    
    @AfterMethod
	public void tearDown() {
		
		driver.quit();
	}

}
