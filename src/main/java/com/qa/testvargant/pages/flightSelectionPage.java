package com.qa.testvargant.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.testvagrant.testbase.TestBase;

public class flightSelectionPage extends TestBase{
	
	
	@FindBy(xpath="//div[@class='main col-lg-9 col-md-9 col-sm-12 col-xs-12']//div[5]//div[1]//div[2]//div[7]//p[1]//a[1]")
	WebElement bookFlight;
	
	public flightSelectionPage() {
		
		PageFactory.initElements(driver, this);
	}
	
	public reviewFlightdetailsPage clickBookButton() {
		
		bookFlight.click();
		return new reviewFlightdetailsPage();
	}
}
