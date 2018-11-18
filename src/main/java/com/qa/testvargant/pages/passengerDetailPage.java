package com.qa.testvargant.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.testvagrant.testbase.TestBase;

public class passengerDetailPage extends TestBase{
	
	
	@FindBy(xpath="//div[@ng-class=\"{'details_of_passenger':!checkPaxType(pax.paxLabel,'INFANT') && !$last, 'details_of_infant':checkPaxType(pax.paxLabel,'INFANT')}\"]//input[@placeholder='First Name']")
	WebElement firstName;
	
	@FindBy(xpath="//div[@ng-class=\"{'details_of_passenger':!checkPaxType(pax.paxLabel,'INFANT') && !$last, 'details_of_infant':checkPaxType(pax.paxLabel,'INFANT')}\"]//input[@placeholder='Last Name']")
	WebElement lastName;
	
	@FindBy(xpath="	//span[@class='gender_option col-lg-5 col-md-5 col-sm-4 col-xs-12']//a[@class='segmented_btn list_view_btn first pull-left col-lg-6 col-md-6 col-sm-6 col-xs-6 ng-animate active-add'][contains(text(),'MALE')]")
	WebElement gender;
	
	@FindBy(xpath="//input[@placeholder='Mobile Number']")
	WebElement contactDetails;
	
	@FindBy(xpath="//a[@class='btn btn-lg btn-primary-red col-lg-5 col-md-5 col-sm-5 col-xs-12 dblblack_bloker ng-binding']")
	WebElement continueButton;
	
	 public void passengerDetailsPage() {
			
			PageFactory.initElements(driver, this);
		}
	 
	 public logOutPage submitPassengerDetails(String fname, String lname) {
		 
		 firstName.sendKeys(fname);
		 lastName.sendKeys(lname);
		 gender.click();
		 contactDetails.sendKeys("8792586579");
		 continueButton.click();
		 return new logOutPage();
		 
	 }

}
