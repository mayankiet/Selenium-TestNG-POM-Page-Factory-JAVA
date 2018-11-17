package com.qa.testvargant.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.qa.testvagrant.testbase.TestBase;

public class LoginPage extends TestBase{
	@FindBy(xpath=".//*[@id='logo__b2c']/p/a/img")
	WebElement logo;
	
	@FindBy(xpath=".//*[@id='ch_login_icon']")
	WebElement clickLogin;
	
	@FindBy(xpath=".//*[@id='ch_login_email']")
	WebElement username;
	
	@FindBy(name=".//*[@id='ch_login_password']")
	WebElement password;
	
	@FindBy(xpath=".//*[@id='ch_login_btn']")
	WebElement login;
	
	public LoginPage() {
		
		PageFactory.initElements(driver, this);
	}
	
	public boolean verifyLogo() {
		
		return logo.isDisplayed();
	}
	
	public void clickLogin() {
		
		 clickLogin.click();
		
	}
	public void verifyLogin(String usr, String psw) {
		
		username.sendKeys(usr);
		password.sendKeys(psw);
		login.click();
	}
	
}