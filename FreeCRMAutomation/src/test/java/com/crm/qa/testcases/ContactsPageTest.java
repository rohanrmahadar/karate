package com.crm.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.crm.qa.base.TestBase;
import com.crm.qa.pages.ContactsPage;
import com.crm.qa.pages.HomePage;
import com.crm.qa.pages.LoginPage;
import com.crm.qa.util.TestUtil;

public class ContactsPageTest extends TestBase{

	LoginPage loginPage;
	HomePage homePage;
	ContactsPage contactsPage;
		
	public ContactsPageTest() {
		super();
	}
	
	@BeforeMethod
	public void setup() {
		
		initilization();
		loginPage=new LoginPage();
		homePage=loginPage.login(prop.getProperty("username"),prop.getProperty("password"));
		contactsPage=homePage.clickOnContacts();
	}
	
	@Test(priority=1)
	public void verifyContactsLabelTest() {
		
		Assert.assertTrue(contactsPage.verifyContactsLabel());
	}
	
	@Test(priority=2)
	public void selectSingleContactsTest() {
		
		contactsPage.selectContactsByName("abc xyz");
	}
	
	@Test(priority=3,dataProvider = "freeCRMTestData")
	public void validateCreateNewContact(String fName, String lname, String company) {
		
		homePage.clickOnAddContactsLink();
		contactsPage.createNewContact(fName, lname, company);
	}
	
	@DataProvider
	public Object[][] freeCRMTestData(){
		Object [][] data=TestUtil.getTestData("ContactsList");
		return data;
	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
}
