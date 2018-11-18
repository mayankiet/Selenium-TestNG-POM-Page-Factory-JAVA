package com.qa.testvargant.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.qa.testvagrant.testbase.TestBase;

public class logOutPage extends TestBase{
	
	@FindBy(xpath="")
	WebElement logOut;
	
	public logOutPage() {
		
		PageFactory.initElements(driver, this);
	}
	
	public void checkOut() {
		
		Select sel = new Select(logOut);
	    sel.selectByValue("Logout");
	}

}
