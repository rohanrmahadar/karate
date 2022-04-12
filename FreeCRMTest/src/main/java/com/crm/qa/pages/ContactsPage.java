package com.crm.qa.pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import org.openqa.selenium.support.ui.WebDriverWait;

import com.crm.qa.base.TestBase;

public class ContactsPage extends TestBase {

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

	WebDriverWait wait = new WebDriverWait(driver, 30);

	public ContactsPage() {
		PageFactory.initElements(driver, this);
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
