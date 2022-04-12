package com.crm.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;

public class ContactsPage extends TestBase{
	
	@FindBy(xpath="//div[@id='dashboard-toolbar']/div[@class='ui header item mb5 light-black']")
	WebElement contactsLabel;
	
	@FindBy(xpath = "//button[contains(text(),'New')]")
	WebElement newContactsLink;

	@FindBy(xpath = "//input[@name='first_name']")
	WebElement firstName;

	@FindBy(xpath = "//input[@name='last_name']")
	WebElement lastName;

	@FindBy(xpath = "//div[@name='company']")
	WebElement companyName;

	@FindBy(xpath = "//button[contains(text(),'Save')]")
	WebElement saveContactLink;
		
	public ContactsPage() {
		PageFactory.initElements(driver, this);
	}
	
	public boolean verifyContactsLabel() {
		return contactsLabel.isDisplayed();
	}
	
	public void selectContactsByName(String name){
		driver.findElement(By.xpath("//a[contains(text(),'"+name+"')]//parent::td//preceding-sibling::td//div")).click();
	}
	
	public void createNewContact(String fName, String lname, String company) {

		try {

			newContactsLink.click();
			System.out.println("Clicked on new contacts link");
			firstName.sendKeys(fName);
			lastName.sendKeys(lname);
			companyName.sendKeys(company);
			companyName.sendKeys(Keys.ENTER);
			saveContactLink.click();

		} catch (Exception e) {

			e.printStackTrace();
		}

	}
}
