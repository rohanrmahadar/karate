package com.crm.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;

public class HomePage extends TestBase{

	@FindBy(xpath="//span[contains(text(),'Rohan Mahadar')]")
	WebElement username;
	
	@FindBy(xpath="//span[contains(text(),'Home')]")
	WebElement homeTab;		
		
	@FindBy(xpath="//span[contains(text(),'Contacts')]")
	WebElement contactsLink;
	
	@FindBy(xpath="//span[contains(text(),'Deals')]")
	WebElement dealsLink;
	
	@FindBy(xpath="//span[contains(text(),'Tasks')]")
	WebElement tasksLink;
	
	@FindBy(xpath="//a[@href='/contacts']/following-sibling::button[@class='ui mini basic icon button")
	WebElement addContact;
	
	public HomePage(){
		PageFactory.initElements(driver, this);
	}
	
	
	public boolean validateUsername() {
		return username.isDisplayed();
	}
	
	public boolean validateLandingOnHomePage() {
		return homeTab.isDisplayed();
	}
		
	public ContactsPage clickOnContacts() {
		contactsLink.click();
		return new ContactsPage();
	}
	
	public DealsPage clickOnDeals() {
		dealsLink.click();
		return new DealsPage();
		
	}
	
	public TasksPage clickOnTasks() {
		tasksLink.click();
		return new TasksPage();	
	}
	
	public void clickOnAddContactsLink() {
		addContact.click();
	}
	
}
