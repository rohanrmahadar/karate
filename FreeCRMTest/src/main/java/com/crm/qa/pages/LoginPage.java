package com.crm.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;

public class LoginPage extends TestBase{

	@FindBy(name="email")
	WebElement emailAddress;
	
	@FindBy(name="password")
	WebElement password;
	
	@FindBy(xpath="//*[@class='ui fluid large blue submit button']")
	WebElement loginButton;
	
	public LoginPage () {
		
		PageFactory.initElements(driver, this);
		
	}
	
	public String validateLoginPageTitle() {
		return driver.getTitle();
	}
	
	public HomePage login (String un, String pw) {
		
		emailAddress.sendKeys(un);
		password.sendKeys(pw);
		loginButton.click();
		return new HomePage();
	}
}
