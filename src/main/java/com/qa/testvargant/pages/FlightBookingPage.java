package com.qa.testvargant.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.qa.testvagrant.testbase.TestBase;

public class FlightBookingPage extends TestBase{
	
	
	@FindBy(xpath="//span[@class='overlayWrapper']")
	WebElement flightLink;
	
	@FindBy(xpath="//input[@id='hp-widget__sfrom']")
	WebElement fromSource;
	
	@FindBy(xpath="//input[@id='hp-widget__sTo']")
	WebElement toDestination;
	
	@FindBy(xpath=".//*[@id='hp-widget__depart']")
	WebElement clickDestination;
	
	@FindBy(xpath=".//*[@id='hp-widget__depart']")
	WebElement departDateClick;
	
	@FindBy(xpath=".//*[@id='dp1542486644253']/div/div[1]/table/tbody/tr[4]/td[7]")
	WebElement departDateSelect;
	

	@FindBy(xpath=".//*[@id='hp-widget__paxCounter_pot']")
	WebElement clickPassengers;
	
	@FindBy(xpath=".//*[@id='js-adult_counter']/li[1]")
	WebElement passengers;
	
	@FindBy(xpath=".//*[@id='searchBtn']")
	WebElement search;
	
    public FlightBookingPage() {
		
		PageFactory.initElements(driver, this);
	}
    
    public void clickFlightLink() {
    	
    	flightLink.click();
    }
    
    public flightSelectionPage searchFlight() {
    	
    	Select selectSourceCity = new Select(fromSource);
    	selectSourceCity.selectByValue("Bangalore (BLR)");
    	
    	Select selectDestinationCity = new Select(toDestination);
    	selectDestinationCity.selectByValue("Delhi (DEL))");
    	
    	//Departure date selection
    	departDateClick.click();
    	departDateSelect.click();
    	
    	//Passengers
    	clickPassengers.click();
    	passengers.click();
    	
    	//Search Flight
    	search.click();
        return new flightSelectionPage();    	
    }
    
}
