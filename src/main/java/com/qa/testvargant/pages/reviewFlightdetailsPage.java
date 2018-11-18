package com.qa.testvargant.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.qa.testvagrant.testbase.TestBase;

public class reviewFlightdetailsPage extends TestBase{
	
	
	@FindBy(xpath="//label[@class='yes_insure']//span[@class='upsell_radio_icon insure_radio_icon']")
    WebElement clickEnsureLifeInsurance;
	
	@FindBy(xpath="//div[@class='col-lg-11 col-md-11 col-sm-12 row']")
    WebElement acceptLifeInsurance;
	
	@FindBy(xpath="//div[@class='row continue_login append_bottom40']")
    WebElement clickContinueButton;
	
    public reviewFlightdetailsPage() {
		
		PageFactory.initElements(driver, this);
	}
    
    public passengerDetailPage clickContinueAndAccept() {
    	
    	clickEnsureLifeInsurance.click();
    	acceptLifeInsurance.click();
    	clickContinueButton.click();
    	return new passengerDetailPage();
    	
    }
	
}
