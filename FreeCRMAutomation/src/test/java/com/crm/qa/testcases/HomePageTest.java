package com.crm.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.crm.qa.base.TestBase;
import com.crm.qa.pages.ContactsPage;
import com.crm.qa.pages.DealsPage;
import com.crm.qa.pages.HomePage;
import com.crm.qa.pages.LoginPage;
import com.crm.qa.pages.TasksPage;

public class HomePageTest extends TestBase {

	LoginPage loginPage;
	HomePage homePage;
	ContactsPage contactsPage;
		
	public HomePageTest() {
		super();
	}
	
	@BeforeMethod
	public void setup() {
		
		initilization();
		loginPage=new LoginPage();
		homePage=loginPage.login(prop.getProperty("username"),prop.getProperty("password"));
	}
	
	@Test(priority=1)
	public void verifyCorrectUsernameTest() {
		
		Assert.assertTrue(homePage.validateUsername());
	}
	
	@Test(priority=2)
	public void verifyHomePageTest() {
		
		Assert.assertTrue(homePage.validateLandingOnHomePage());
		
	}
	
	@Test(priority=3)
	public void verifyContactsLinkTest() {
		
		contactsPage=homePage.clickOnContacts();
		
	}
	
		
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
	


}
